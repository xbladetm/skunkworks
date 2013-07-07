/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezBoard;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class ViewhTest {
	
	public ViewhTest() {
	}

	/**
	 * Test of updateBoard method, of class Viewh.
	 */
	@Test
	public void testUpdateBoard() {
		System.out.println("updateBoard");
		Viewh instance = new Viewh();
		instance.updateBoard();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setUpTasks method, of class Viewh.
	 */
	@Test
	public void testSetUpTasks() {
		System.out.println("setUpTasks");
		Viewh instance = new Viewh();
		instance.setUpTasks();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addController method, of class Viewh.
	 */
	@Test
	public void testAddController() {
		System.out.println("addController");
		Controller c = null;
		Viewh instance = new Viewh();
		instance.addController(c);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}