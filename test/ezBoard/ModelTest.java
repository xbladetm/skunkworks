/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezBoard;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class ModelTest {
	
	public ModelTest() {
	}

	/**
	 * Test of getToDo method, of class Model.
	 */
	@Test
	public void testGetToDo() {
		System.out.println("getToDo");
		Model instance = new Model();
		ArrayList expResult = null;
		ArrayList result = instance.getToDo();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getInProgress method, of class Model.
	 */
	@Test
	public void testGetInProgress() {
		System.out.println("getInProgress");
		Model instance = new Model();
		ArrayList expResult = null;
		ArrayList result = instance.getInProgress();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getDone method, of class Model.
	 */
	@Test
	public void testGetDone() {
		System.out.println("getDone");
		Model instance = new Model();
		ArrayList expResult = null;
		ArrayList result = instance.getDone();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of registerObserver method, of class Model.
	 */
	@Test
	public void testRegisterObserver() {
		System.out.println("registerObserver");
		IBoardObserver o = null;
		Model instance = new Model();
		instance.registerObserver(o);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of removeObserver method, of class Model.
	 */
	@Test
	public void testRemoveObserver() {
		System.out.println("removeObserver");
		IBoardObserver o = null;
		Model instance = new Model();
		instance.removeObserver(o);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of notifyObservers method, of class Model.
	 */
	@Test
	public void testNotifyObservers() {
		System.out.println("notifyObservers");
		Model instance = new Model();
		instance.notifyObservers();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}