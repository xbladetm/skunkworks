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

import com.sun.rowset.internal.Row;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Answer implements Serializable, Iterable {

    private ArrayList<IData> objects;

    /**
     *
     */
    public Answer() {
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

    public ArrayList<IData> getObjects() {
        return objects;
    }
}
