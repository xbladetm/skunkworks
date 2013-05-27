/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezServer;

import ezDataBase.DbConnection;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 */
public class ComServer {

    private static DatagramSocket server;
    private static DatagramPacket packet;

    /**
     *
     * @param param
     */
    public static void main(String param) {

        try {
            server = new DatagramSocket();

            while (true) {

                server.receive(packet);
                Request req = new Request(packet);
                req.start();

            }
        } catch (SocketException ex) {
            Logger.getLogger(ComServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ComServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void quit() {
        server.close();
    }
}
