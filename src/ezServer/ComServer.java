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
 * @author Andrei
 */
public class ComServer {

    private static ServerSocket server;
    private static Socket s;

    /**
     *
     * @param param
     */
    public static void main(String param) {

        try {
            server = new ServerSocket();

            while (true) {

                server.accept();
                Request req = new Request(s);
                req.start();

            }
        } catch (SocketException ex) {
            Logger.getLogger(ComServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ComServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     */
    public void quit() {
        try {
            server.close();
        } catch (IOException ex) {
            Logger.getLogger(ComServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
