package ezDataBase;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class QueryTest {
	
	public QueryTest() {
	}

	/**
	 * Test of getString method, of class Query.
	 */
	@Test
	public void testGetString() {
		System.out.println("getString");
		Query instance = new Query("consulta", "tipo");
		String expResult = "consulta";
		String result = instance.getString();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getType method, of class Query.
	 */
	@Test
	public void testGetType() {
		System.out.println("getType");
		Query instance = new Query("consulta", "tipo");
		String expResult = "tipo";
		String result = instance.getType();
		assertEquals(expResult, result);
	}
}