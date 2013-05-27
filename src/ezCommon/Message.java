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

    private String type; //task, user,
    private String operation; //get, put, update
    private IData data;

    public Message() {
        type = null;
        data = null;
        operation = null; // CREATE GETTERS AND SETTERS
    }

    public void setMessage(IData msg) {
        data = msg;
    }

    public void setMessage(String t, String s) {
        type = new String();
        type = t;
        if (type.equals("cell")) {
            data = new Cell();
        }
        if (type.equals("User")) {
            data = new User();
        }
        if (type.equals("task")) {
            data = new Task(s);
        }
        if (type.equals("text")) {
            data = new Text();
        }
        data.create(s);

    }

    public IData getMessage() {
        return data;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t.toLowerCase();
    }

    public void setOperation(String op) {
        operation = op.toLowerCase();
    }

    public String getOperation() {
        return operation;
    }
}
