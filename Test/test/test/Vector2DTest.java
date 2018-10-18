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
public class Vector2DTest {
    
    public Vector2DTest() {
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
     * Test of getX method, of class Vector2D.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Vector2D instance = new Vector2D();
        float expResult = 0.0F;
        float result = instance.getX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Vector2D.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        float x = 0.0F;
        Vector2D instance = new Vector2D();
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZ method, of class Vector2D.
     */
    @Test
    public void testGetZ() {
        System.out.println("getZ");
        Vector2D instance = new Vector2D();
        float expResult = 0.0F;
        float result = instance.getZ();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZ method, of class Vector2D.
     */
    @Test
    public void testSetZ() {
        System.out.println("setZ");
        float z = 0.0F;
        Vector2D instance = new Vector2D();
        instance.setZ(z);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Vector2D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Vector2D instance = new Vector2D();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vector2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector2D instance = new Vector2D();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addVector2D method, of class Vector2D.
     */
    @Test
    public void testAddVector2D_Vector2D_Vector2D() {
        System.out.println("addVector2D");
        Vector2D v1 = null;
        Vector2D v2 = null;
        Vector2D expResult = null;
        Vector2D result = Vector2D.addVector2D(v1, v2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addVector2D method, of class Vector2D.
     */
    @Test
    public void testAddVector2D_Vector2D() {
        System.out.println("addVector2D");
        Vector2D v1 = null;
        Vector2D instance = new Vector2D();
        Vector2D expResult = null;
        Vector2D result = instance.addVector2D(v1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubVector2D method, of class Vector2D.
     */
    @Test
    public void testSubVector2D_Vector2D_Vector2D() {
        System.out.println("SubVector2D");
        Vector2D v1 = null;
        Vector2D v2 = null;
        Vector2D expResult = null;
        Vector2D result = Vector2D.SubVector2D(v1, v2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubVector2D method, of class Vector2D.
     */
    @Test
    public void testSubVector2D_Vector2D() {
        System.out.println("SubVector2D");
        Vector2D v1 = null;
        Vector2D instance = new Vector2D();
        Vector2D expResult = null;
        Vector2D result = instance.SubVector2D(v1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mulConstant method, of class Vector2D.
     */
    @Test
    public void testMulConstant_Vector2D_float() {
        System.out.println("mulConstant");
        Vector2D v1 = null;
        float Constant = 0.0F;
        Vector2D instance = new Vector2D();
        Vector2D expResult = null;
        Vector2D result = instance.mulConstant(v1, Constant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mulConstant method, of class Vector2D.
     */
    @Test
    public void testMulConstant_float() {
        System.out.println("mulConstant");
        float Constant = 0.0F;
        Vector2D instance = new Vector2D();
        Vector2D expResult = null;
        Vector2D result = instance.mulConstant(Constant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Length method, of class Vector2D.
     */
    @Test
    public void testLength() {
        System.out.println("Length");
        Vector2D instance = new Vector2D();
        float expResult = 0.0F;
        float result = instance.Length();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Nomalize method, of class Vector2D.
     */
    @Test
    public void testNomalize() {
        System.out.println("Nomalize");
        Vector2D instance = new Vector2D();
        instance.Nomalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Vector2D.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Vector2D.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
