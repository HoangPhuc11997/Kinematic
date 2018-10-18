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
public class KinematicOutputTest {
    
    public KinematicOutputTest() {
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
     * Test of getVelocity method, of class KinematicOutput.
     */
    @Test
    public void testGetVelocity() {
        System.out.println("getVelocity");
        KinematicOutput instance = new KinematicOutput();
        Vector2D expResult = null;
        Vector2D result = instance.getVelocity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVelocity method, of class KinematicOutput.
     */
    @Test
    public void testSetVelocity() {
        System.out.println("setVelocity");
        Vector2D Velocity = null;
        KinematicOutput instance = new KinematicOutput();
        instance.setVelocity(Velocity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoutation method, of class KinematicOutput.
     */
    @Test
    public void testGetRoutation() {
        System.out.println("getRoutation");
        KinematicOutput instance = new KinematicOutput();
        float expResult = 0.0F;
        float result = instance.getRoutation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoutation method, of class KinematicOutput.
     */
    @Test
    public void testSetRoutation() {
        System.out.println("setRoutation");
        float Routation = 0.0F;
        KinematicOutput instance = new KinematicOutput();
        instance.setRoutation(Routation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class KinematicOutput.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        KinematicOutput instance = new KinematicOutput();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class KinematicOutput.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        KinematicOutput instance = new KinematicOutput();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
