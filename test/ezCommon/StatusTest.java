/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezCommon;

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
public class StatusTest {

    public StatusTest() {
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
     * Test of values method, of class Status.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Status[] expResult = null;
        Status[] result = Status.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Status.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Status expResult = null;
        Status result = Status.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
