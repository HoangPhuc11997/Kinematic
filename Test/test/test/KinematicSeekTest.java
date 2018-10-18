/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 103
 */
public class KinematicSeekTest {
    
    public KinematicSeekTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCharacter method, of class KinematicSeek.
     */
    @Test
    public void testGetCharacter() {
        System.out.println("getCharacter");
        KinematicSeek instance = new KinematicSeek();
        Character expResult = null;
        Character result = instance.getCharacter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCharacter method, of class KinematicSeek.
     */
    @Test
    public void testSetCharacter() {
        System.out.println("setCharacter");
        Character character = null;
        KinematicSeek instance = new KinematicSeek();
        instance.setCharacter(character);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarget method, of class KinematicSeek.
     */
    @Test
    public void testGetTarget() {
        System.out.println("getTarget");
        KinematicSeek instance = new KinematicSeek();
        Character expResult = null;
        Character result = instance.getTarget();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarget method, of class KinematicSeek.
     */
    @Test
    public void testSetTarget() {
        System.out.println("setTarget");
        Character target = null;
        KinematicSeek instance = new KinematicSeek();
        instance.setTarget(target);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxSpeed method, of class KinematicSeek.
     */
    @Test
    public void testGetMaxSpeed() {
        System.out.println("getMaxSpeed");
        KinematicSeek instance = new KinematicSeek();
        float expResult = 0.0F;
        float result = instance.getMaxSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxSpeed method, of class KinematicSeek.
     */
    @Test
    public void testSetMaxSpeed() {
        System.out.println("setMaxSpeed");
        float maxSpeed = 0.0F;
        KinematicSeek instance = new KinematicSeek();
        instance.setMaxSpeed(maxSpeed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateKinematicOutput method, of class KinematicSeek.
     */
    @Test
    public void testGenerateKinematicOutput() {
        System.out.println("generateKinematicOutput");
        KinematicSeek instance = new KinematicSeek();
        KinematicOutput expResult = null;
        KinematicOutput result = instance.generateKinematicOutput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class KinematicSeek.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        KinematicSeek.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
