/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.userMVC;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class UserControllerTest {
	
	public UserControllerTest() {
	}

	/**
	 * Test of addModel method, of class UserController.
	 */
	@Test
	public void testAddModel() {
		System.out.println("addModel");
		UserModel m = null;
		UserController instance = new UserController();
		instance.addModel(m);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addView method, of class UserController.
	 */
	@Test
	public void testAddView() {
		System.out.println("addView");
		UserView v = null;
		UserController instance = new UserController();
		instance.addView(v);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of runView method, of class UserController.
	 */
	@Test
	public void testRunView() {
		System.out.println("runView");
		UserController instance = new UserController();
		instance.runView();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}