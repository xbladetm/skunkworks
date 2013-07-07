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
public class UserViewTest {
	
	public UserViewTest() {
	}

	/**
	 * Test of addController method, of class UserView.
	 */
	@Test
	public void testAddController() {
		System.out.println("addController");
		UserController controller = null;
		UserView instance = new UserView();
		instance.addController(controller);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of updateClient method, of class UserView.
	 */
	@Test
	public void testUpdateClient() {
		System.out.println("updateClient");
		UserView instance = new UserView();
		instance.updateClient();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}