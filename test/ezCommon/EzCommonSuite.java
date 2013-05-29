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
@Suite.SuiteClasses({ezCommon.StatusTest.class, ezCommon.AnswerTest.class, ezCommon.TaskTest.class, ezCommon.IDataTest.class, ezCommon.UserTest.class, ezCommon.PriorityTest.class})
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
