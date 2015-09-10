/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.pkg7;

import java.util.TreeMap;

/**
 *
 * @author Ma. Belen
 */
//Esta clase contiene metodos para determinar que metodo de l clase Binary Tree Utilizar
//Recorre el arbol en in order
public class BinarySearchTree<E> {
    BinaryTree ROOT;
    public BinarySearchTree()
    {
        this.ROOT = null;
    }
    
    void insertNode(BinaryTree node, TreeMap entry)
    {
        String data;
        data=entry.firstKey().toString();
        BinaryTree arbol= new BinaryTree(entry);
        if (node == null)
        {
            node = new BinaryTree(data);
            ROOT = node;
        }
        else if ((data.compareTo(node.getValue().toString())<0) && (node.getLeftChild() == null))
        {
            //node.left = new BinaryTree(data);
            node.setLeftChild(arbol);
        }
        else if ((data.compareTo(node.getValue().toString())<0) && (node.getLeftChild() == null))
        {
            node.setRightChild(arbol);
        }
        else
        {
            if (data.compareTo(node.getValue().toString())<0)
            {
                insertNode(node.getLeftChild(), entry);
            }
            else
            {
                insertNode(node.getRightChild(), entry);
            }
        }
    }
    
}
