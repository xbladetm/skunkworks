/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezCommon;

import ezDataBase.Query;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class AnswerTest {
	
	public AnswerTest() {
	}

	/**
	 * Test of sendQuery method, of class Answer.
	 */
	@Test
	public void testSendQuery() {
		System.out.println("sendQuery");
		Query q = null;
		Answer instance = new Answer();
		Answer expResult = null;
		Answer result = instance.sendQuery(q);
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

	/**
	 * Test of getObjects method, of class Answer.
	 */
	@Test
	public void testGetObjects() {
		System.out.println("getObjects");
		Answer instance = new Answer();
		ArrayList expResult = null;
		ArrayList result = instance.getObjects();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}