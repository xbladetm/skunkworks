/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezDataBase;

import ezDataBase.query.Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 */
public class DbConnection {

    static volatile DbConnection uniqueInstance;
    Connection connect;
    Statement query;

    private DbConnection() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost/EZKanban", "superadmin", "12345");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        query = null;
    }

    /**
     *
     * @return
     */
    public DbConnection getInstance() {
        if (uniqueInstance == null) {
            synchronized (DbConnection.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DbConnection();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     *
     * @param q
     * @return
     */
    public ResultSet runQuery(Query q) {
        try {
            query = connect.createStatement();
            query.executeQuery(q.getString());

            return query.getResultSet();


        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    /**
     *
     * @return
     */
    public boolean isConnected() {
        boolean isIt = false;
        try {
            isIt = connect.isValid(50);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isIt;
    }
}
