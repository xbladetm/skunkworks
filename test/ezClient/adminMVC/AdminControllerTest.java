/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.adminMVC;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class AdminControllerTest {
	
	public AdminControllerTest() {
	}

	/**
	 * Test of addModel method, of class AdminController.
	 */
	@Test
	public void testAddModel() {
		System.out.println("addModel");
		AdminModel m = null;
		AdminController instance = new AdminController();
		instance.addModel(m);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addView method, of class AdminController.
	 */
	@Test
	public void testAddView() {
		System.out.println("addView");
		AdminView v = null;
		AdminController instance = new AdminController();
		instance.addView(v);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of runView method, of class AdminController.
	 */
	@Test
	public void testRunView() {
		System.out.println("runView");
		AdminController instance = new AdminController();
		instance.runView();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}