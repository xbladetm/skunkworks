/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezCommon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Andrei
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({StatusTest.class, AnswerTest.class, CellTest.class, TextTest.class, TaskTest.class, IDataTest.class, UserTest.class, PriorityTest.class})
public class EzCommonSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}
