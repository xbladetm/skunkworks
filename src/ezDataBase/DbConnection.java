/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezDataBase;

import java.sql.Connection;
import java.sql.Driver;
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

    static final DbConnection uniqueInstance = new DbConnection();
    Connection connect;
    Statement query;

    private DbConnection() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ezkanban?user=superadmin&password=12345");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        query = null;
    }

    /**
     *
     * @return
     */
    public static DbConnection getInstance() {
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

    public int runUpdate(Query q) {
        try {
            query = connect.createStatement();

            return query.executeUpdate(q.getString());


        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;

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
