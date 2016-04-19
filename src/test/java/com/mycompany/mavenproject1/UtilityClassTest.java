/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brendan.Watson
 */
public class UtilityClassTest {
    
    public UtilityClassTest() {
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
     * Test of concatWords method, of class UtilityClass.
     */
    @Test
  public void concatWords_inputStringsHelloWorld_OutputsOneString() {
        System.out.println("concatWords");
        UtilityClass myUtilityObj = new UtilityClass();
        String result = myUtilityObj.concatWords("Hello", ", ", "world", "!");
        String expResult = "Hello, world!";
         assertEquals(expResult, result);
    }


    /**
     * Test of computeFactorial method, of class UtilityClass.
     */
  @Test
        public void computeFactorial_Factorial5_Is120(){
          System.out.println("ComputeFactorial 5");
          UtilityClass myUtilityObj = new UtilityClass();
        assertEquals("120",myUtilityObj.computeFactorial(5));
    }

              @Test (expected=IllegalArgumentException.class)
            public void computeFactorial_FactorialNegative5_ThrowsException() {
            System.out.println("computeFactorial of -5");
            final int factorialOf = -5;
             UtilityClass myUtilityObj = new UtilityClass();
        System.out.println(factorialOf + "! = " + myUtilityObj.computeFactorial(factorialOf));
}

    
}
