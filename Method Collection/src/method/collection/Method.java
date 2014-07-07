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
    
}
