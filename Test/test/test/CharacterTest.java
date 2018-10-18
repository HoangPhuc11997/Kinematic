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
public class CharacterTest {
    
    public CharacterTest() {
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
     * Test of getOrientation method, of class Character.
     */
    @Test
    public void testGetOrientation() {
        System.out.println("getOrientation");
        Character instance = new Character();
        float expResult = 0.0F;
        float result = instance.getOrientation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrientation method, of class Character.
     */
    @Test
    public void testSetOrientation() {
        System.out.println("setOrientation");
        float orientation = 0.0F;
        Character instance = new Character();
        instance.setOrientation(orientation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class Character.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Character instance = new Character();
        Vector2D expResult = null;
        Vector2D result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class Character.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Vector2D position = null;
        Character instance = new Character();
        instance.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRotation method, of class Character.
     */
    @Test
    public void testGetRotation() {
        System.out.println("getRotation");
        Character instance = new Character();
        float expResult = 0.0F;
        float result = instance.getRotation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRotation method, of class Character.
     */
    @Test
    public void testSetRotation() {
        System.out.println("setRotation");
        float routation = 0.0F;
        Character instance = new Character();
        instance.setRotation(routation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVelocity method, of class Character.
     */
    @Test
    public void testGetVelocity() {
        System.out.println("getVelocity");
        Character instance = new Character();
        Vector2D expResult = null;
        Vector2D result = instance.getVelocity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVelocity method, of class Character.
     */
    @Test
    public void testSetVelocity() {
        System.out.println("setVelocity");
        Vector2D velocity = null;
        Character instance = new Character();
        instance.setVelocity(velocity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Character.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        KinematicOutput kinematicOutput = null;
        float time = 0.0F;
        Character instance = new Character();
        instance.update(kinematicOutput, time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applyNewOrientation method, of class Character.
     */
    @Test
    public void testApplyNewOrientation() {
        System.out.println("applyNewOrientation");
        Character instance = new Character();
        instance.applyNewOrientation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
