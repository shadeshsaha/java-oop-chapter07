/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutil;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shadesh
 */
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getStudentID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentID method, of class Student.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        int studentID = 0;
        Student instance = new Student();
        instance.setStudentID(studentID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartment method, of class Student.
     */
    @Test
    public void testGetDepartment() {
        System.out.println("getDepartment");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getDepartment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartment method, of class Student.
     */
    @Test
    public void testSetDepartment() {
        System.out.println("setDepartment");
        String department = "";
        Student instance = new Student();
        instance.setDepartment(department);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMc method, of class Student.
     */
    @Test
    public void testGetMc() {
        System.out.println("getMc");
        Student instance = new Student();
        MealCard expResult = null;
        MealCard result = instance.getMc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMc method, of class Student.
     */
    @Test
    public void testSetMc() {
        System.out.println("setMc");
        MealCard mc = null;
        Student instance = new Student();
        instance.setMc(mc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
