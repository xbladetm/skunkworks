package ezCommon;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Andrés Giustini
 * @author Andrei Mirza
 */
public class AnswerTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSetType() {
        Answer m = new Answer();
        m.setType("TEXT");
        assertEquals(m.getType(), "text");
    }

    @Test
    public void testSetMessage() {
        Answer m = new Answer();
        m.createEmptyMessage("text", "Ola k ase");
        assertEquals(m.getMessage().getClass(), new Text().getClass());

    }

    /**
     * Test of createEmptyMessage method, of class Answer.
     */
    @Test
    public void testSetMessage_IData() {
        System.out.println("setMessage");
        IData msg = null;
        Answer instance = new Answer();
        instance.createFromData(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createEmptyMessage method, of class Answer.
     */
    @Test
    public void testSetMessage_String_String() {
        System.out.println("setMessage");
        String t = "";
        String s = "";
        Answer instance = new Answer();
        instance.createEmptyMessage(t, s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class Answer.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Answer instance = new Answer();
        IData expResult = null;
        IData result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Answer.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Answer instance = new Answer();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Answer.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Answer instance = new Answer();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
