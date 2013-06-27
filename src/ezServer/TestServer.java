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
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 */
public class TestServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        SocketAddress server = new InetSocketAddress("localhost", 6969);
        //Create a socket and connect to the server
        Query q = new Query("SELECT * FROM TASKS", "task");
        try (Socket s = new Socket()) {
            s.connect(server);
            //Send the query
            ObjectOutputStream queryOutput = new ObjectOutputStream(s.getOutputStream());
            queryOutput.writeObject(q);

            //and get it back
            Answer a;
            ObjectInputStream QueryInput = new ObjectInputStream(s.getInputStream());
            a = (Answer) QueryInput.readObject();
            System.out.printf(a.getObjects().toString());
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(TestServer.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
