/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezServer;

import ezCommon.Message;
import ezDataBase.DbConnection;
import ezDataBase.query.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 */
public class Request extends Thread {

    private class Sender {

        int port;
        InetAddress address;

        public Sender(int p, InetAddress a) {
            port = p;
            address = a;
        }
    }
    Sender sender;
    DatagramPacket packet;
    Message message;
    Query query;
    DbConnection dataBase;
    ResultSet answer;
    DatagramSocket socket;

    Request(DatagramPacket p) {
        packet = p;
    }

    @Override
    public void run() {
        sender = new Sender(packet.getPort(), packet.getAddress());
        //message = packet.getData(); ------ FIX THIS
        query = createQuery(message);
        dataBase = dataBase.getInstance();
        answer = dataBase.runQuery(query);
        //message=new Message(type,null,answer);
        packet.setPort(sender.port);
        packet.setAddress(sender.address);
        try {
            //packet.setData(message);--------------- FIX THIS
            socket.send(packet);
        } catch (IOException ex) {
            Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
        }
        socket.close();

    }
    /*
     * REGISTER SENDER DATA
     *
     * CREATE QUERY
     *
     * EXECUTE QUERY
     *
     * CREATE MESSAGE FROM QUERY
     *
     * SERIALIZE MESSAGE
     *
     * SEND RETURN TO SENDER
     *
     */

    private Query createQuery(Message message) {
        String operation = message.getOperation();
        String type = message.getType();
        switch (operation) {
            case "get":
                switch (type) {
                    case "user":
                        //query=new GetUserQuery(message.getData());
                        break;
                    case "task":
                        //query=new GetTaskQuery(message.getData());
                        break;
                }
                break;

            case "put":
                switch (type) {
                    case "user":
                        //query=new PutUserQuery(message.getData());
                        break;
                    case "task":
                        //query=new PutTaskQuery(message.getData());
                        break;
                }
                break;

            case "update":
                switch (type) {
                    case "user":
                        //query=new GetUserQuery(message.getData());
                        break;
                    case "task":
                        //query=new GetTaskQuery(message.getData());
                        break;
                }
                break;
        }


        return query;

    }
}
