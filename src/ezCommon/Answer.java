/**
 * The Answer class creates various types of messages to be sent across the
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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

public class Answer implements Serializable, Iterable {

    private ArrayList<IData> objects;

    /**
     *
     */
    public Answer() {
        objects = null;
    }

    /**
     *
     * @param r
     */
    public Answer(ResultSet r, String type) {
        objects = new ArrayList<>();

    }

    @Override
    public Iterator iterator() {
        return objects.iterator();
    }
}
