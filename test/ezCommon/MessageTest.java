package ezCommon;

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
public class MessageTest {

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
        Message m = new Message();
        m.setType("TEXT");
        assertEquals(m.getType(), "text");
    }

    @Test
    public void testSetMessage() {
        Message m = new Message();
        m.setMessage("text", "Ola k ase");
        assertEquals(m.getMessage().getClass(), new Text().getClass());

    }

    /**
     * Test of setMessage method, of class Message.
     */
    @Test
    public void testSetMessage_IData() {
        System.out.println("setMessage");
        IData msg = null;
        Message instance = new Message();
        instance.setMessage(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class Message.
     */
    @Test
    public void testSetMessage_String_String() {
        System.out.println("setMessage");
        String t = "";
        String s = "";
        Message instance = new Message();
        instance.setMessage(t, s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class Message.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Message instance = new Message();
        IData expResult = null;
        IData result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Message.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Message instance = new Message();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
