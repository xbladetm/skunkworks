/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient;

import ezCommon.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class LoginDialogTest {
	
	public LoginDialogTest() {
	}

	/**
	 * Test of getLoginUser method, of class LoginDialog.
	 */
	@Test
	public void testGetLoginUser() {
		System.out.println("getLoginUser");
		LoginDialog instance = null;
		User expResult = null;
		User result = instance.getLoginUser();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of login method, of class LoginDialog.
	 */
	@Test
	public void testLogin() {
		System.out.println("login");
		String u = "";
		String p = "";
		LoginDialog instance = null;
		boolean expResult = false;
		boolean result = instance.login(u, p);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}