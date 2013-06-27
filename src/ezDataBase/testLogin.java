/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezDataBase;

import ezCommon.Answer;
import ezCommon.User;
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
public class testLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (login("superadmin", "12345")) {
            System.out.println("Login good");
        } else {
            System.out.println("Login bad");

        }
    }

    public static boolean login(String u, String p) {
        Query q = new Query("SELECT * FROM users WHERE username= '" + u + "'; ", "user");

        Answer a = sendQuery(q);
        if (!a.getObjects().isEmpty()) {
            User usr = (User) a.getObjects().get(0);
            return usr.checkPass(p);
        }
        return false;

    }

    private static Answer sendQuery(Query q) {
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
                Logger.getLogger(ezBoard.Model.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(ezBoard.Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
