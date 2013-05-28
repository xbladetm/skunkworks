/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezServer;

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
@Suite.SuiteClasses({ezServer.RequestTest.class, ezServer.ComServerTest.class})
public class EzServerSuite {

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
