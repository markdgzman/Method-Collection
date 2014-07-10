/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package method.collection;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Mark
 */
public class Method {
    
    //Shuffles an integer array. Can be used to shuffle a deck of cards.
    public int [] shuffleArray(int [] array)
    {
        Random rand = new Random();
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                int nextNumber = rand.nextInt(array.length - 1);
                
                int temp = array[i];
                array[i] = array[nextNumber];
                array[nextNumber] = temp;
            }
        }
        
        return array;
    }
    
    //Given two string check to see if one is a permutation of the other
    public boolean stringPermutation(String a, String b)
    {
        char [] s1 = a.toCharArray();
        char [] s2 = b.toCharArray();
        
        if(s1.length > s2.length || s1.length < s2.length)
        {
            return false;
        }
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        for(int i = 0; i < s1.length; i++)
        {
            if(s1[i] != s2[i])
            {
                return false;
            }
        }
        
        return true;
    }
    
    
    //Reverse String function
    public String reverseString(String s)
    {
        char [] a = s.toCharArray();
        String revString = "";
        
        for(int i = a.length; i > 0; i--)
        {
            revString += a[i-1];
        }
    
        return revString;
    }
    
    //Unique Chars, checks if string has all unique values.
    public boolean uniqueChars(String s)
    {
        char [] a = s.toCharArray();
        
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length; j++)
            {
                if(a[i] == a[j] && i != j)
                    return false;
            }
        }
        
        return true;
    }
    
    //Nth Fibonacchi Sequence
    public long fib(int n)
    {
        long fib1 = 1;
        long fib2 = 1;
        long fib3 = 0;
        
        if(n == 1 || n == 2)
            return 1;
        
        
        for(int i = 2; i < n; i++)
        {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        
        return fib3;
    }
    
    //Vowel Count, counts the number of vowels in a string
    public int vowelCount(String s)
    {
        char [] a = s.toCharArray();
        int count = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == 'a' || a[i] == 'i' || a[i] == 'u' 
                    || a[i] == 'e' || a[i] == 'o')
            {
                count++;
            }
        }
        
        return count;
    }
}
