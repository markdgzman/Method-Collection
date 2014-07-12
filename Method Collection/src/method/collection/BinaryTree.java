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
public class BinaryTree {
    
    public class Node {    
    
        private Object data;
        Node left;
        Node right;
        
        public Node(Object data)
        {
            this.data = data;
        }
}
    
    Node tree;
    
    public void insert(Object data)
    {   
        Node current = tree;
        insert(current, data);
    }
    
    private void insert(Node node, Object data)
    {
        Node newNode = new Node(data);
        Node current = node;
        
        if(current == null)
            current = newNode;
        else
        {
            if(current.left != null)
                insert(current.left);
            else
                insert(current.right);
        }
    }
    
}
