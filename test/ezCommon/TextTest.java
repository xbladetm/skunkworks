/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezCommon;

import java.util.ArrayList;
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
public class TextTest {

    public TextTest() {
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
     * Test of getStrings method, of class Text.
     */
    @Test
    public void testGetStrings() {
        System.out.println("getStrings");
        Text instance = new Text();
        ArrayList expResult = null;
        ArrayList result = instance.getStrings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class Text.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String s = "";
        Text instance = new Text();
        instance.create(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
