/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezDataBase;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrei
 */
public class DbConnectionTest {

    public DbConnectionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class DbConnection.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        DbConnection instance = null;
        DbConnection expResult = null;
        DbConnection result = instance.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of runQuery method, of class DbConnection.
     */
    @Test
    public void testRunQuery() {
        System.out.println("runQuery");
        Query q = null;
        DbConnection instance = null;
        ResultSet expResult = null;
        ResultSet result = instance.runQuery(q);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isConnected method, of class DbConnection.
     */
    @Test
    public void testIsConnected() {
        System.out.println("isConnected");
        DbConnection instance = null;
        boolean expResult = false;
        boolean result = instance.isConnected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
