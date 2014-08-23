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
    
    //Words in string, counts number of words in a string
    public int wordInString(String s )
    {
        
        String [] split = s.split("\\s+");
        return split.length;
    }
    
    //String compression. Compresses a string into the letter and number of 
    //times it shows up afterwards;
    public String stringCompression(String s)
    {
        char [] a = s.toCharArray();
        String newString = "", returnString = "";
        int counter = 0;
        char currentChar;
        
        for(int i = 0; i < a.length; i++)
        {
            currentChar = a[i];
            newString = ""; 
            counter = 0;
            
            for(int j = 0; j< a.length; j++)
            {      
                if(a[i] == a[j])
                {
                    counter++; 
                }
                else if(a[i] != a[j])
                {
                    newString += a[j];
                }  
            }
            
            returnString += currentChar +""+ counter;
            a = newString.toCharArray();      
        }
        
        return returnString;
    }
    
    //Alternate string compression, takes the character and adds a number
    //next to it depending on how many times it shows up
    public String alternateStringCompression(String s)
    {
        char [] a = s.toCharArray();
        
        String newString = "";
        char currentChar = a[0];
        int counter = 0;
        
        for(int i =0; i < a.length; i++)
        {
            if(currentChar == a[i])
            {
                counter++;
            }
            else
            {
                newString += currentChar + "" + counter;
                counter = 1;
                currentChar = a[i];
            }
        }
        newString += currentChar + "" + counter;
        return newString;
    }
    
    public int [] selectionSort(int [] a)
    {
        int min; int pos = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            min = a[i];
            
            for(int j = i; j < a.length; j++)
            {
                if(min > a[j])
                {
                    min = a[j];
                    pos = j;
                }          
            }
            
            if(min < a[i])
            {
                int temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
            }
            
        }   
        return a;
    }
    
    //Decimal to Binary
    public String decimalToBinary(int dec)
    {
        String bin = "";
        
        while(dec > 0)
        {
            bin = dec%2 + bin;
            dec /= 2;
        }
        
        return bin;
    }
    
    //Given an input of hour and minutes returns the corresponding angle
    //On a round clock
    public int clockAngle(int hour, int min)
    {
        //Degrees in clock
        int clockDegrees = 360;

        double doubleAngleHour = 3.0/12.0;
        int angleHour = (int)(clockDegrees * (hour/12.0));
        int angleMin = (int)(clockDegrees * (min/60.0));
        
        //Can cast as positive if negative or can choose which to subtract 
        //depending on size
        if(min > hour)
            return angleMin - angleHour;
        else if(min == 0 && hour == 0)
            return 360;
        else
            return angleHour - angleMin;
    }
       
}
