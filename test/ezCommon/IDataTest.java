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
public class IDataTest {

    public IDataTest() {
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
     * Test of getStrings method, of class IData.
     */
    @Test
    public void testGetStrings() {
        System.out.println("getStrings");
        IData instance = new IDataImpl();
        ArrayList expResult = null;
        ArrayList result = instance.getStrings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class IData.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String s = "";
        IData instance = new IDataImpl();
        instance.create(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IDataImpl implements IData {

        public ArrayList<String> getStrings() {
            return null;
        }

        public void create(String s) {
        }
    }
}
