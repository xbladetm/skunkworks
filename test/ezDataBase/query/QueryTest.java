/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezDataBase.query;

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
public class QueryTest {

    public QueryTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getString method, of class Query.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        Query instance = new QueryImpl();
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class QueryImpl implements Query {

        public String getString() {
            return "";
        }
    }
}
