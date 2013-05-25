/**
 * The Message class creates various types of messages to be sent across the
 * system.
 *
 * These messages are serializable and therefore are sent trough the network as
 * objects.
 *
 * @author Andrei Mirza
 * @author Andrés Giustini
 *
 *
 *
 */
package ezCommon;

import java.io.Serializable;

public class Message implements Serializable {

    private String type;
    private String operation;
    private IData message;

    public Message() {
        type = null;
        message = null;
        operation = null; // CREATE GETTERS AND SETTERS
    }

    public void setMessage(IData msg) {
        message = msg;
    }

    public void setMessage(String t, String s) {
        type = new String();
        type = t;
        if (type.equals("cell")) {
            message = new Cell();
        }
        if (type.equals("User")) {
            message = new User();
        }
        if (type.equals("task")) {
            message = new Task();
        }
        if (type.equals("text")) {
            message = new Text();
        }
        message.create(s);

    }

    public IData getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public void SetType(String t) {
        type = t.toLowerCase();
    }
}
