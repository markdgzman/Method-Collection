/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package method.collection;

/**
 *
 * @author Mark
 */
public class MethodCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree();
        
        tree.insert("Hello");
        tree.insert("Hi Again");
        tree.insert("GOOOO");
        tree.insert("GOOBADEDEDE");
        
        int [] deck = {11, 23, 55, 32, 22, 4, 2, 112, 4554};
        
        for(int i = 0; i < deck.length; i++)
        {
            System.out.println(deck[i]);
        }
           
        System.out.println("Shuffle");
        Method shuffle = new Method();
        shuffle.shuffleArray(deck);
        for(int i = 0; i < deck.length; i++)
        {
            System.out.println(deck[i]);
        }
        
        
        //Permutation
        Method permutation = new Method();
        
        String s1 = "Booboo";
        String s2 = "ooBoob";
        
        System.out.println(permutation.stringPermutation(s1, s2));
        
        //Reverse String
        Method reverse = new Method();
        
        String rev = "Reverse This";
        System.out.println(reverse.reverseString(rev));
        
        
        //Unique Chars
        Method unique = new Method();
        String b1 = "abcde";
        String b2 = "abbcd";
        System.out.println(unique.uniqueChars(b1));
        System.out.println(unique.uniqueChars(b2));
    }
    
}
