package ezCommon;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;


public class TaskTest {
	// (int tid, String desc, Priority p, int uid, Date added, Date comp, Status s, int scu)
	
	Date d = new Date();
	Status s;
	Priority p;
	public TaskTest() {
	}

	/**
	 * Test of getTaskID method, of class Task.
	 */
	@Test
	public void testGetTaskID() {
		System.out.println("getTaskID");
		Task instance = new Task(1, "desc", p, 2, d, d, s, 3);
		String expResult = "" + 1;
		String result = instance.getTaskID();
		assertEquals(expResult, result);

	}

	/**
	 * Test of getStatus method, of class Task.
	 */
	@Test
	public void testGetStatus() {
		System.out.println("getStatus");
		Task instance = new Task(1, "desc", p, 2, d, d, s, 3);
		Status expResult = s;
		Status result = instance.getStatus();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDescription method, of class Task.
	 */
	@Test
	public void testGetDescription() {
		System.out.println("getDescription");
		Task instance = new Task(1, "desc", p, 2, d, d, s, 3);
		String expResult = "desc";
		String result = instance.getDescription();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getPriority method, of class Task.
	 */
	@Test
	public void testGetPriority() {
		System.out.println("getPriority");
		Task instance = new Task(1, "desc", p, 2, d, d, s, 3);
		String expResult = "" + p;
		String result = instance.getPriority();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getUserID method, of class Task.
	 */
	@Test
	public void testGetUserID() {
		System.out.println("getUserID");
		Task instance = new Task(1, "desc", p, 2, d, d, s, 3);
		String expResult = "" + 2;
		String result = instance.getUserID();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDoneDate method, of class Task.
	 */
	@Test
	public void testGetDoneDate() {
		System.out.println("getDoneDate");
		Task instance = new Task(1, "desc", p, 2, d, d, s, 3);
		java.sql.Date expResult = new java.sql.Date(d.getTime());
		String result = instance.getDoneDate();
		assertEquals(expResult.toString(), result);
	}

	/**
	 * Test of getAddedDate method, of class Task.
	 */
	@Test
	public void testGetAddedDate() {
		System.out.println("getAddedDate");
		Task instance = new Task(1, "desc", p, 2, d, d, s, 3);
		java.sql.Date expResult = new java.sql.Date(d.getTime());
		String result = instance.getAddedDate();
		assertEquals(expResult.toString(), result);
	}

	/**
	 * Test of getScrumUnits method, of class Task.
	 */
	@Test
	public void testGetScrumUnits() {
		System.out.println("getScrumUnits");
		Task instance = new Task(1, "desc", p, 2, d, d, s, 3);
		String expResult = "" + 3;
		String result = instance.getScrumUnits();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setDescription method, of class Task.
	 */
	@Test
	public void testSetDescription() {
		System.out.println("setDescription");
		String des = "desc";
		Task instance = new Task();
		instance.setDescription(des);
		assertEquals(des, instance.getDescription());
	}

	/**
	 * Test of setPriority method, of class Task.
	 */
	@Test
	public void testSetPriority() {
		System.out.println("setPriority");
		Priority pri = Priority.LOW;
		String pr = "" + pri;
		Task instance = new Task();
		instance.setPriority(pr);
		assertEquals(pr, instance.getPriority());
	}

	/**
	 * Test of setUserId method, of class Task.
	 */
	@Test
	public void testSetUserId() {
		System.out.println("setUserId");
		int uid = 0;
		Task instance = new Task();
		instance.setUserId(uid);
		String expResult = "" + uid;
		assertEquals(expResult, instance.getUserID());
	}

	/**
	 * Test of setAdded method, of class Task.
	 */
	@Test
	public void testSetAdded() {
		System.out.println("setAdded");
		java.sql.Date a = new java.sql.Date(d.getTime());
		String b = a.toString();
		Task instance = new Task();
		instance.setAdded(b);
	}

	/**
	 * Test of setCompleted method, of class Task.
	 */
	@Test
	public void testSetCompleted() {
		System.out.println("setCompleted");
		java.sql.Date a = new java.sql.Date(d.getTime());
		String b = a.toString();
		Task instance = new Task();
		instance.setCompleted(b);
	}

	/**
	 * Test of setStatus method, of class Task.
	 */
	@Test
	public void testSetStatus() {
		System.out.println("setStatus");
		Status st = Status.DONE;
		Task instance = new Task();
		instance.setStatus(""+st);
		assertEquals(st, instance.getStatus());
	}

	/**
	 * Test of setScrumUnits method, of class Task.
	 */
	@Test
	public void testSetScrumUnits() {
		System.out.println("setScrumUnits");
		String u = "" + 3;
		Task instance = new Task();
		instance.setScrumUnits(u);
		assertEquals(u, instance.getScrumUnits());
	}

}