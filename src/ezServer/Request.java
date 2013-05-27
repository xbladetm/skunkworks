/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezServer;

import ezCommon.Message;
import ezDataBase.DbConnection;
import ezDataBase.query.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
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
    Message message;
    Query query;
    DbConnection dataBase;
    ResultSet answer;

    Request(Socket s) {
        socket = s;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream messageInput = new ObjectInputStream(socket.getInputStream());
            message = (Message) messageInput.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
        }
        query = createQuery(message);
        dataBase = dataBase.getInstance();
        answer = dataBase.runQuery(query);
        //message=new Message(type,null,answer);
        try {

            ObjectOutputStream messageOutput = new ObjectOutputStream(socket.getOutputStream());
            messageOutput.writeObject(message);
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
                        //query=new UpdateUserQuery(message.getData());
                        break;
                    case "task":
                        //query=new UpdateTaskQuery(message.getData());
                        break;
                }
                break;
        }


        return query;

    }
}
