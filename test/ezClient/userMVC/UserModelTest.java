/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.userMVC;

import ezClient.IClientObserver;
import ezCommon.Task;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class UserModelTest {
	
	public UserModelTest() {
	}

	/**
	 * Test of registerObserver method, of class UserModel.
	 */
	@Test
	public void testRegisterObserver() {
		System.out.println("registerObserver");
		IClientObserver o = null;
		UserModel instance = null;
		instance.registerObserver(o);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of removeObserver method, of class UserModel.
	 */
	@Test
	public void testRemoveObserver() {
		System.out.println("removeObserver");
		IClientObserver o = null;
		UserModel instance = null;
		instance.removeObserver(o);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of notifyObservers method, of class UserModel.
	 */
	@Test
	public void testNotifyObservers() {
		System.out.println("notifyObservers");
		UserModel instance = null;
		instance.notifyObservers();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of updateTask method, of class UserModel.
	 */
	@Test
	public void testUpdateTask() {
		System.out.println("updateTask");
		Task t = null;
		UserModel instance = null;
		instance.updateTask(t);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}