package ezBoard;

import java.util.*;
import ezCommon.*;
import ezDataBase.DbConnection;
import ezDataBase.Query;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @authors Andrei, Andrés
 *
 */
public class Model implements IBoardSubject {

    ArrayList<IBoardObserver> boardObservers;
    ArrayList<IData> colToDo;
    ArrayList<IData> colInProgress;
    ArrayList<IData> colDone;

    public Model() {
        this.colToDo = new ArrayList<>();
        this.colInProgress = new ArrayList<>();
        this.colDone = new ArrayList<>();
        this.boardObservers = new ArrayList<>();
        System.out.println("Model()");
        this.colToDo = getToDosFromDb();
        this.colInProgress = getInProgressFromDb();
        this.colDone = getDoneFromDb();
    }

    public int getNumToDo() {
        return this.colToDo.size();
    }

    public int getNumInProgress() {
        return this.colInProgress.size();
    }

    public int getNumDone() {
        return this.colDone.size();
    }

    public void addTask(Task t) {
        Status s = t.getStatus();
        boolean update = false;

        switch (s) {
            case NOTSTARTED:
                if (!this.colToDo.contains(t)) {
                    this.colToDo.add(t);
                    update = true;
                }
                break;
            case INPROGRESS:
                if (!this.colInProgress.contains(t)) {
                    this.colInProgress.add(t);
                    update = true;
                }
                break;
            case DONE:
                if (!this.colDone.contains(t)) {
                    this.colDone.add(t);
                    update = true;
                }
                break;
        }

        // Only will notify the observer if it has
        // added a task that did not exist
        if (update) {
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(IBoardObserver o) {
        boardObservers.add(o);
    }

    @Override
    public void removeObserver(IBoardObserver o) {
        boardObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IBoardObserver o : boardObservers) {
            o.updateBoard();
        }
    }

    private ArrayList<IData> getToDosFromDb() {
        Query q = new Query("SELECT * FROM tasks WHERE status='NOT STARTED", "task");
        Answer a = sendQuery(q);
        return a.getObjects();



    }

    private ArrayList<IData> getInProgressFromDb() {
        Query q = new Query("SELECT * FROM tasks WHERE status='IN PROGRESS", "task");
        Answer a = sendQuery(q);
        return a.getObjects();

    }

    private ArrayList<IData> getDoneFromDb() {
        Query q = new Query("SELECT * FROM tasks WHERE status='DONE", "task");
        Answer a = sendQuery(q);
        return a.getObjects();

    }

    private Answer sendQuery(Query q) {
        try {
            SocketAddress server = new InetSocketAddress("localhost", 6969);
            //Create a socket and connect to the server
            try (Socket s = new Socket()) {
                s.connect(server);
                //Send the query
                ObjectOutputStream queryOutput = new ObjectOutputStream(s.getOutputStream());
                queryOutput.writeObject(q);

                //Retrieve the answer
                ObjectInputStream AnswerInput = new ObjectInputStream(s.getInputStream());
                Answer a;
                a = (Answer) AnswerInput.readObject();
                return a;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
