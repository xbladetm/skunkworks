/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezDataBase;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class testLoginTest {
	
	public testLoginTest() {
	}

	/**
	 * Test of main method, of class testLogin.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		testLogin.main(args);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of login method, of class testLogin.
	 */
	@Test
	public void testLogin() {
		System.out.println("login");
		String u = "";
		String p = "";
		boolean expResult = false;
		boolean result = testLogin.login(u, p);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}