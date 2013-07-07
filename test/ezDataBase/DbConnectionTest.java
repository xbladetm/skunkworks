package ezDataBase;

import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class DbConnectionTest {
	
	public DbConnectionTest() {
	}

	/**
	 * Test of getInstance method, of class DbConnection.
	 */
	@Test
	public void testGetInstance() {
		System.out.println("getInstance");
		DbConnection expResult = null;
		DbConnection result = DbConnection.getInstance();
		assertEquals(expResult, result);
	}

	/**
	 * Test of runQuery method, of class DbConnection.
	 */
	@Test
	public void testRunQuery() {
		System.out.println("runQuery");
		Query q = null;
		DbConnection instance = null;
		ResultSet expResult = null;
		ResultSet result = instance.runQuery(q);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		//fail("The test case is a prototype.");
	}

	/**
	 * Test of runUpdate method, of class DbConnection.
	 */
	@Test
	public void testRunUpdate() {
		System.out.println("runUpdate");
		Query q = null;
		DbConnection instance = null;
		int expResult = 0;
		int result = instance.runUpdate(q);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		//fail("The test case is a prototype.");
	}

	/**
	 * Test of isConnected method, of class DbConnection.
	 */
	@Test
	public void testIsConnected() {
		System.out.println("isConnected");
		DbConnection instance = null;
		boolean expResult = false;
		boolean result = instance.isConnected();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		//fail("The test case is a prototype.");
	}
}