/* Query es un objeto serializable que almacena el texto de una consulta a la
 * base de datos y el tipo de la misma.
 * Estamos utilizando 3 tipos de consultas, consultas para usuarios, para tareas
 * y consultas para modificar el contenido de la BD.
 */
package ezDataBase;

import java.io.Serializable;

/**
 *
 * @author Andrei
 * @author Andrés
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
