/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezServer;

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
public class ComServerTest {

    public ComServerTest() {
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
     * Test of main method, of class ComServer.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String param = "";
        ComServer.main(param);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quit method, of class ComServer.
     */
    @Test
    public void testQuit() {
        System.out.println("quit");
        ComServer instance = new ComServer();
        instance.quit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
