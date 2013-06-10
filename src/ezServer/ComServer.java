/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrés,Andrei
 */
public class ComServer {

    private static ServerSocket server;
    private static Socket s;

    /**
     *
     * @param param
     */
    public static void main(String[] param) {

        try {
            server = new ServerSocket(6969);
            System.out.println("SERVER: Server is running");
            while (true) {

                s = server.accept();
                System.out.println("SERVER: Accepted Connection! Starting request.");
                Request req = new Request(s);
                req.start();
                System.out.println("SERVER: Request Ended");

            }
        } catch (SocketException ex) {
            Logger.getLogger(ComServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ComServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
