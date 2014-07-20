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
import java.util.Arrays;

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
        
        String c = "BBABBAEEDGG";
        String d = "GGDEEABBBBA";
        Method instance2 = new Method();
        boolean expResult2 = true;
        boolean result2 = instance.stringPermutation(c, d);
        assertEquals(expResult2, result2);
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
        int n = 11;
        Method instance = new Method();
        long expResult = 89;
        long result = instance.fib(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of vowelCount method, of class Method.
     */
    @Test
    public void testVowelCount() {
        System.out.println("vowelCount");
        Method instance = new Method();
        String s = "This is a sentence";
        int expResult = 6;
        long result = instance.vowelCount(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testWordCount() {
        System.out.println("wordCount");
        Method instance = new Method();
        String s = "This is a sentence! Another one. And another.";
        int expResult = 8;
        long result = instance.wordInString(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringCompression() {
        System.out.println("stringCompression");
        Method instance = new Method();
        String s = "aabcccccaaa";
        String expResult = "a5b1c5";
        String result = instance.stringCompression(s);
        assertEquals(expResult, result);
    }
        
    @Test
    public void testAlternateStringCompression() {
        System.out.println("stringCompression");
        Method instance = new Method();
        String s = "aabcccccaaa";
        String expResult = "a2b1c5a3";
        String result = instance.alternateStringCompression(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSelectionSort() {
        System.out.println("selectionSort");
        Method instance = new Method();
        int [] a = {5, 3, 2, 4, 1};
        int [] expResult = {1, 2, 3, 4, 5};
        int [] result = instance.selectionSort(a);
        
        
        assertTrue(Arrays.equals(a, expResult));
    }
    
    @Test
    public void testSelectionSortRepeatedNumbers() {
        System.out.println("selectionSort");
        Method instance = new Method();
        int [] a = {5, 3, 3, 4, 1, 1, 5, 6};
        int [] expResult = {1, 1, 3, 3, 4, 5, 5, 6};
        int [] result = instance.selectionSort(a);
        
        
        assertTrue(Arrays.equals(a, expResult));
    }
    
    @Test
    public void testSelectionSortLargeArray() {
        System.out.println("selectionSort");
        Method instance = new Method();
        int [] a = {5, 3, 2, 4, 1, 6, 7, 10, 8, 9, 11, 21, 20, 15, 12, 13, 14, 17, 16, 19, 18};
        int [] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int [] result = instance.selectionSort(a);
        
        assertTrue(Arrays.equals(a, expResult));
    }
}
