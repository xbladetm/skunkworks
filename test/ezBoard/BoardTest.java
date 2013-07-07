/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezBoard;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class BoardTest {
	
	public BoardTest() {
	}

	/**
	 * Test of runMVC method, of class Board.
	 */
	@Test
	public void testRunMVC() {
		System.out.println("runMVC");
		Board instance = new Board();
		instance.runMVC();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of main method, of class Board.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] params = null;
		Board.main(params);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}