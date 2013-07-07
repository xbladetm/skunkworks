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
public class ClientTest {
	
	public ClientTest() {
	}

	/**
	 * Test of runAdminMVC method, of class Client.
	 */
	@Test
	public void testRunAdminMVC() {
		System.out.println("runAdminMVC");
		User user = null;
		Client instance = new Client();
		instance.runAdminMVC(user);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of runUserMVC method, of class Client.
	 */
	@Test
	public void testRunUserMVC() {
		System.out.println("runUserMVC");
		User user = null;
		Client instance = new Client();
		instance.runUserMVC(user);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of main method, of class Client.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] params = null;
		Client.main(params);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}