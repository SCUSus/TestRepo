/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Susanne
 */
public class SimpleTestClassTest {
    
    public SimpleTestClassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("before everything");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("after everything");
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of countChar method, of class SimpleTestClass.
     */
    @Test
    public void testCountChar() {
        System.out.println("standard test countChar");
        
        ////from prototype when creating test for known class
        //String str = "";
        //char c = ' ';
        //int expResult = 0;
        //int result = SimpleTestClass.countChar(str, c);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
