/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezServer;

import ezCommon.Answer;
import ezDataBase.DbConnection;
import ezDataBase.Query;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 */
public class Request extends Thread {

    Socket socket;
    Answer message;
    Query query;
    DbConnection dataBase;
    ResultSet answer;

    Request(Socket s) {
        socket = s;
    }

    @Override
    public void run() {
        System.out.println("REQUEST: Request Created");
        try {
            ObjectInputStream QueryInput = new ObjectInputStream(socket.getInputStream());
            query = (Query) QueryInput.readObject();
            System.out.println("REQUEST: Read query from socket: " + query.getString());
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("REQUEST: Retrieveing Db connection");
        dataBase = DbConnection.getInstance();
        //Might not work with threads; may need sync'd access.
        System.out.println("REQUEST: Attempting to run query");
        if (query.getType().equals("modify")) {
            int done = dataBase.runUpdate(query);
            if (done == 1) {
                System.out.println("REQUEST: Update Successful");
            } else {
                System.out.println("REQUEST: Update Failed");


            }
        } else {
            answer = dataBase.runQuery(query);
            System.out.println("REQUEST: Parsing result");
            message = new Answer(answer, query.getType());

            System.out.println("REQUEST: Sending Answer");
            try {

                ObjectOutputStream answerOutput = new ObjectOutputStream(socket.getOutputStream());
                answerOutput.writeObject(message);
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println("REQUEST: Request finished.");
    }
}
