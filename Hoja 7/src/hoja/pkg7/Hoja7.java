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
                //BinarySearchTree busqueda = new BinarySearchTree();
                ArrayList<TreeMap> lista= new ArrayList<TreeMap>();
                for(String line; (line = br.readLine()) != null; ){
                    String[] entry;
                    entry= line.split(",");
                    entry[0]=entry[0].substring(1);
                    entry[1]=(String) entry[1].subSequence(1, entry[1].length()-1);
                    TreeMap<String, String> entrada = new TreeMap();
                    entrada.put(entry[0], entry[1]);
                    lista.add(entrada);
                    System.out. println(entry[0]);
                    System.out.println(entry[1]);
                }
                
                for (int i=0; i<lista.size(); i++){
                    System.out.print(lista.get(i)+", ");
                }
            }
            catch(Exception e){
                
            }
        }
        catch(Exception e){
            
        }
    }
    
}
