/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.pkg7;

import java.io.*;
import java.util.*;

/**
 *
 * @author Ma. Belen
 */
public class Hoja7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        File fileDiccionario= new File ("diccionario.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileDiccionario));
            try { 
                BinaryTree diccionario= new BinaryTree(null);
                BinarySearchTree funciones = new BinarySearchTree();
                ArrayList<TreeMap> lista= new ArrayList<TreeMap>();
                for(String line; (line = br.readLine()) != null; ){
                    String[] entry;
                    entry= line.split(",");
                    entry[0]=entry[0].substring(1);
                    entry[1]=(String) entry[1].subSequence(1, entry[1].length()-1);
                    TreeMap<String, String> entrada = new TreeMap();
                    entrada.put(entry[0], entry[1]);
                    lista.add(entrada);
                }
               
                diccionario.setValue(lista.get(0));
                /*System.out.println(diccionario.getValue());
                funciones.insertNode(diccionario, lista.get(1));
                System.out.println(diccionario.getLeftChild().getValue());*/
                
                /*funciones.insertNode(diccionario, lista.get(3));
                //funciones.insertNode(diccionario, lista.get(3));
                System.out.println(diccionario.getValue());
               // System.out.println(diccionario.getLeftChild().getValue());
                System.out.println(diccionario.getRightChild().getValue());*/
                
                for (int x=1; x<lista.size(); x++){
                    funciones.insertNode(diccionario, lista.get(x));
                }
                funciones.printInOrder(diccionario);
            }
            catch(Exception e){
            }
        }
        catch(Exception e){
            
        }
    }
    
}
