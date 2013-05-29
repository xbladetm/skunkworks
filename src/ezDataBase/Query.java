/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezDataBase;

import java.io.Serializable;

/**
 *
 * @author Andrei
 */
public class Query implements Serializable {

    String type;
    String query;

    /**
     *
     * @return
     */
    public Query() {
    }

    /**
     *
     * @param q
     * @param t
     */
    public Query(String q, String t) {
        query = q;
        type = t;
    }

    /**
     *
     * @return
     */
    public String getString() {
        return query;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }
}
