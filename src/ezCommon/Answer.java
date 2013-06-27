/**
 * The Answer class creates various types of messages to be sent across the
 * system.
 *
 * These messages are serializable and therefore are sent trough the network as
 * objects.
 *
 * @author Andrei Mirza
 * @author Andrés Giustini
 *
 *
 *
 */
package ezCommon;

import ezDataBase.Query;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Answer implements Serializable, Iterable {

    private ArrayList<IData> objects;

    /**
     *
     */
    public Answer() {
    }

    /**
     *
     * @param r
     */
    public Answer(ResultSet r, String type) {
        objects = new ArrayList<>();
        switch (type) {
            case "task":
                try {
                    while (r.next()) {
                        int taskID = r.getInt("TASKID");
                        String description = r.getString("DESCRIPTION");
                        Priority priority = Priority.valueOf(r.getString("PRIORITY"));
                        int userID = r.getInt("USER");
                        Date added = r.getDate("ADDED");
                        Date completed = r.getDate("COMPLETED");
                        Status status = Status.valueOf(r.getString("STATUS"));
                        int scrumUnits = r.getInt("SCRUM UNITS");
                        Task t = new Task(taskID, description, priority, userID, added, completed, status, scrumUnits);
                        System.out.println("Adding task to objects:" + t.getString());
                        objects.add(t);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Answer.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "user":
                try {
                    while (r.next()) {
                        int userId = r.getInt("UID");
                        String name = r.getString("NAME");
                        String surname = r.getString("SURNAME");
                        Rank rank = Rank.valueOf(r.getString("RANK"));
                        Team team = Team.valueOf(r.getString("TEAM"));
                        int scrumUnits = r.getInt("SCRUMUNITS");
                        String username = r.getString("USERNAME");
                        String password = r.getString("PASSWORD");
                        User u = new User(userId, name, surname, rank, team, scrumUnits, username, password);
                        objects.add(u);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Answer.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }

    public Answer sendQuery(Query q) {
        try {
            SocketAddress server = new InetSocketAddress("localhost", 6969);
            //Create a socket and connect to the server
            try (Socket s = new Socket()) {
                s.connect(server);
                //Send the query
                ObjectOutputStream queryOutput = new ObjectOutputStream(s.getOutputStream());
                queryOutput.writeObject(q);
                if (!q.getType().equals("modify")) {

                    //Retrieve the answer
                    ObjectInputStream AnswerInput = new ObjectInputStream(s.getInputStream());
                    Answer a;
                    a = (Answer) AnswerInput.readObject();
                    return a;
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ezBoard.Model.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(ezBoard.Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Iterator iterator() {
        return objects.iterator();
    }

    public ArrayList<IData> getObjects() {
        return objects;
    }
}
