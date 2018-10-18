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
public class KinematicWanderTest {
    
    public KinematicWanderTest() {
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
     * Test of getCharacter method, of class KinematicWander.
     */
    @Test
    public void testGetCharacter() {
        System.out.println("getCharacter");
        KinematicWander instance = new KinematicWander();
        Character expResult = null;
        Character result = instance.getCharacter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCharacter method, of class KinematicWander.
     */
    @Test
    public void testSetCharacter() {
        System.out.println("setCharacter");
        Character character = null;
        KinematicWander instance = new KinematicWander();
        instance.setCharacter(character);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxSpeed method, of class KinematicWander.
     */
    @Test
    public void testGetMaxSpeed() {
        System.out.println("getMaxSpeed");
        KinematicWander instance = new KinematicWander();
        float expResult = 0.0F;
        float result = instance.getMaxSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxSpeed method, of class KinematicWander.
     */
    @Test
    public void testSetMaxSpeed() {
        System.out.println("setMaxSpeed");
        float maxSpeed = 0.0F;
        KinematicWander instance = new KinematicWander();
        instance.setMaxSpeed(maxSpeed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxRotation method, of class KinematicWander.
     */
    @Test
    public void testGetMaxRotation() {
        System.out.println("getMaxRotation");
        KinematicWander instance = new KinematicWander();
        float expResult = 0.0F;
        float result = instance.getMaxRotation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxRotation method, of class KinematicWander.
     */
    @Test
    public void testSetMaxRotation() {
        System.out.println("setMaxRotation");
        float maxRotation = 0.0F;
        KinematicWander instance = new KinematicWander();
        instance.setMaxRotation(maxRotation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class KinematicWander.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        KinematicWander instance = new KinematicWander();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class KinematicWander.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        KinematicWander instance = new KinematicWander();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBinomial method, of class KinematicWander.
     */
    @Test
    public void testGetBinomial() {
        System.out.println("getBinomial");
        int n = 0;
        double p = 0.0;
        float expResult = 0.0F;
        float result = KinematicWander.randomBinomial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateKinematicSteeringOutput method, of class KinematicWander.
     */
    @Test
    public void testGenerateKinematicSteeringOutput() {
        System.out.println("generateKinematicSteeringOutput");
        KinematicWander instance = new KinematicWander();
        KinematicOutput expResult = null;
        KinematicOutput result = instance.generateKinematicSteeringOutput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
