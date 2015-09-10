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
        String contenido;
        int separador;
        contenido = node.getValue().toString();
        separador = contenido.indexOf("=");
        contenido = contenido.substring(1, separador);
        int comparacion;
        comparacion= data.compareTo(contenido);
        System.out.println(contenido+", "+data);
        System.out.println("comp: "+comparacion);
        if (contenido== null)
        {
            node = arbol;
            ROOT = node;
        }
        else if ((comparacion <0) && (node.getLeftChild() == null))
        {
            node.setLeftChild(arbol);
        }
        else if ((comparacion>=0) && (node.getRightChild() == null))
        {
            node.setRightChild(arbol);
        }
        else
        {
            if (comparacion<0)
            {
                insertNode(node.getLeftChild(), entry);
            }
            else
            {
                insertNode(node.getRightChild(), entry);
            }
        }
    }
    public void printInOrder(BinaryTree node)
    {
        if (node != null)
        {
            printInOrder(node.getLeftChild());
            System.out.print(node.getValue() + " - ");
            printInOrder(node.getRightChild());
        }
        
    }
    
}
