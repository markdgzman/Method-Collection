/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package method.collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mark
 */
public class MethodTest {
    
    public MethodTest() {
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
     * Test of shuffleArray method, of class Method.
     */
    @Test
    public void testShuffleArray() {
        System.out.println("shuffleArray");
        int[] array = null;
        Method instance = new Method();
        int[] expResult = null;
        int[] result = instance.shuffleArray(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringPermutation method, of class Method.
     */
    @Test
    public void testStringPermutation() {
        System.out.println("stringPermutation");
        String a = "ABBA";
        String b = "BABB";
        Method instance = new Method();
        boolean expResult = false;
        boolean result = instance.stringPermutation(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of reverseString method, of class Method.
     */
    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        String s = "";
        Method instance = new Method();
        String expResult = "";
        String result = instance.reverseString(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uniqueChars method, of class Method.
     */
    @Test
    public void testUniqueChars() {
        System.out.println("uniqueChars");
        String s = "";
        Method instance = new Method();
        boolean expResult = false;
        boolean result = instance.uniqueChars(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fib method, of class Method.
     */
    @Test
    public void testFib() {
        System.out.println("fib");
        int n = 0;
        Method instance = new Method();
        long expResult = 0L;
        long result = instance.fib(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
