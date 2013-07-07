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
public class ControllerTest {
	
	public ControllerTest() {
	}

	/**
	 * Test of addView method, of class Controller.
	 */
	@Test
	public void testAddView() {
		System.out.println("addView");
		Viewh v = null;
		Controller instance = new Controller();
		instance.addView(v);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addModel method, of class Controller.
	 */
	@Test
	public void testAddModel() {
		System.out.println("addModel");
		Model m = null;
		Controller instance = new Controller();
		instance.addModel(m);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of updateLists method, of class Controller.
	 */
	@Test
	public void testUpdateLists() {
		System.out.println("updateLists");
		Controller instance = new Controller();
		instance.updateLists();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}