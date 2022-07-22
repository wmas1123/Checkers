/**
 * @author Will Mastronardi
 * @version 1.0
 *
 * This will test the CheckersLogic, and will be used to test the makeMove method in that class.
 * Many of the errors possible can occur in that block, and that is why the makeMove will be tested.
 *
 * Due to the MakeMoveCPU employing the makeMove method for making the move, that method will not be tested.
 *
 * The CPUPlayer is robust, and does not require testing in the class itself, and any issues that can arise will
 * occur during the user experience with the console
 */
package test;

import core.CheckersLogic;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckersLogicTest {

    private static CheckersLogic logic;
    private CheckersLogic logic1;

    public CheckersLogicTest() {

    }

    @BeforeClass
    public static void setUpBeforeClass() {
        logic = new CheckersLogic(true);
    }

    @AfterClass
    public static void tearDownAfterClass() {
        logic = null;
    }

    /**
     * Set up method to create a new CheckersLogic object before each test
     */
    @Before
    public void setUp() {
        logic1 = new CheckersLogic(true);
    }


    /**
     * Tear down method to clear the CheckersLogic object after each test
     */
    @After
    public void tearDown() {
        logic1 = null;
    }

    /**
     * Tests the makemove function
     */
    @Test
    public void testMakeMove1() {
        logic.makeMove(logic.getPlayerX(), -1, -1, 0, 0, logic.getPlayerO());
        logic1.makeMove(logic1.getPlayerX(), -1, -1, 0, 0, logic1.getPlayerO());
    }

    /**
     * Tests the makemove function
     */
    @Test
    public void testMakeMove2() {
        logic.makeMove(logic.getPlayerX(), 0, 0, 0, 0, logic.getPlayerO());
        logic1.makeMove(logic1.getPlayerX(), 0, 0, 0, 0, logic1.getPlayerO());
    }

    /**
     * Tests the makemove function
     */
    @Test
    public void testMakeMove3() {
        logic.makeMove(logic.getPlayerX(), 1, 1, 0, 0, logic.getPlayerO());
        logic1.makeMove(logic1.getPlayerX(), 1, 1, 0, 0, logic1.getPlayerO());
    }

    /**
     * Tests the makemove function
     */
    @Test
    public void testMakeMove4() {
        logic.makeMove(logic.getPlayerX(), 8, 8, 7, 7, logic.getPlayerO());
        logic1.makeMove(logic1.getPlayerX(), 8, 8, 7, 7, logic1.getPlayerO());
    }

    /**
     * Tests the makemove function
     */
    @Test
    public void testMakeMove5() {
        logic.makeMove(logic.getPlayerX(), 1, 1, 6, 6, logic.getPlayerO());
        logic1.makeMove(logic1.getPlayerX(), 1, 1, 6, 6, logic1.getPlayerO());
    }

    /**
     * Tests the makemove function
     */
    @Test
    public void testMakeMove6() {
        logic.makeMove(logic.getPlayerX(), 3, 3, 4, 4, logic.getPlayerO());
        logic1.makeMove(logic1.getPlayerX(), 3, 3, 4, 4, logic1.getPlayerO());
    }

    /**
     * Tests the makemove function
     */
    @Test
    public void testMakeMove7() {
        logic.makeMove(logic.getPlayerX(), 4, 4, 3, 3, logic.getPlayerO());
        logic1.makeMove(logic1.getPlayerX(), 4, 4, 3, 3, logic1.getPlayerO());
    }

    /**
     * Tests the makemove function
     */
    @Test
    public void testMakeMove8() {
        logic.makeMove(logic.getPlayerX(), 7, 7, 8, 8, logic.getPlayerO());
        logic1.makeMove(logic1.getPlayerX(), 7, 7, 8, 8, logic1.getPlayerO());
    }
}
