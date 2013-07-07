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
public class AdminViewTest {
	
	public AdminViewTest() {
	}

	/**
	 * Test of addController method, of class AdminView.
	 */
	@Test
	public void testAddController() {
		System.out.println("addController");
		AdminController controller = null;
		AdminView instance = new AdminView();
		instance.addController(controller);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of updateClient method, of class AdminView.
	 */
	@Test
	public void testUpdateClient() {
		System.out.println("updateClient");
		AdminView instance = new AdminView();
		instance.updateClient();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}