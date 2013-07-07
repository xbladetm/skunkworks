/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.adminMVC;

import ezClient.IClientObserver;
import ezCommon.Task;
import ezCommon.User;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class AdminModelTest {
	
	public AdminModelTest() {
	}

	/**
	 * Test of registerObserver method, of class AdminModel.
	 */
	@Test
	public void testRegisterObserver() {
		System.out.println("registerObserver");
		IClientObserver o = null;
		AdminModel instance = null;
		instance.registerObserver(o);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of removeObserver method, of class AdminModel.
	 */
	@Test
	public void testRemoveObserver() {
		System.out.println("removeObserver");
		IClientObserver o = null;
		AdminModel instance = null;
		instance.removeObserver(o);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of notifyObservers method, of class AdminModel.
	 */
	@Test
	public void testNotifyObservers() {
		System.out.println("notifyObservers");
		AdminModel instance = null;
		instance.notifyObservers();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getTasksFromDb method, of class AdminModel.
	 */
	@Test
	public void testGetTasksFromDb() {
		System.out.println("getTasksFromDb");
		AdminModel instance = null;
		ArrayList expResult = null;
		ArrayList result = instance.getTasksFromDb();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getUSersFromDb method, of class AdminModel.
	 */
	@Test
	public void testGetUSersFromDb() {
		System.out.println("getUSersFromDb");
		AdminModel instance = null;
		ArrayList expResult = null;
		ArrayList result = instance.getUSersFromDb();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addTask method, of class AdminModel.
	 */
	@Test
	public void testAddTask() {
		System.out.println("addTask");
		Task t = null;
		AdminModel instance = null;
		instance.addTask(t);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of removeTask method, of class AdminModel.
	 */
	@Test
	public void testRemoveTask() {
		System.out.println("removeTask");
		Task t = null;
		AdminModel instance = null;
		instance.removeTask(t);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of updateTask method, of class AdminModel.
	 */
	@Test
	public void testUpdateTask() {
		System.out.println("updateTask");
		Task t = null;
		AdminModel instance = null;
		instance.updateTask(t);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addUser method, of class AdminModel.
	 */
	@Test
	public void testAddUser() {
		System.out.println("addUser");
		User u = null;
		AdminModel instance = null;
		instance.addUser(u);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of removeUser method, of class AdminModel.
	 */
	@Test
	public void testRemoveUser() {
		System.out.println("removeUser");
		User u = null;
		AdminModel instance = null;
		instance.removeUser(u);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of updateUser method, of class AdminModel.
	 */
	@Test
	public void testUpdateUser() {
		System.out.println("updateUser");
		User u = null;
		AdminModel instance = null;
		instance.updateUser(u);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of main method, of class AdminModel.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] params = null;
		AdminModel.main(params);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}