/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezServer;

import ezCommon.Answer;
import ezDataBase.DbConnection;
import ezDataBase.query.*;
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
        try {
            ObjectInputStream QueryInput = new ObjectInputStream(socket.getInputStream());
            query = (Query) QueryInput.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
        }

        dataBase = dataBase.getInstance();
        //Might not work with threads; may need sync'd access.
        answer = dataBase.runQuery(query);
        message = new Answer(answer, query.getType());
        try {

            ObjectOutputStream answerOutput = new ObjectOutputStream(socket.getOutputStream());
            answerOutput.writeObject(message);
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
