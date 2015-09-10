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
            BufferedReader br2 = new BufferedReader(new FileReader(fileText));
            try { 
                BinaryTree diccionario= new BinaryTree(null);
                BinarySearchTree funciones = new BinarySearchTree();
                ArrayList<TreeMap> lista= new ArrayList<TreeMap>();
                for(String line; (line = br.readLine()) != null; ){
                    String[] entry;
                    entry= line.split(",");
                    entry[0]=entry[0].substring(1).toLowerCase();
                    entry[1]=(String) entry[1].subSequence(1, entry[1].length()-1);
                    entry[1]=entry[1].toLowerCase();
                    TreeMap<String, String> entrada = new TreeMap();
                    entrada.put(entry[0], entry[1]);
                    lista.add(entrada);
                }
                for(String line2; (line2 = br2.readLine()) != null; ){
                    System.out. println("Oracion en ingles:\n"+line2);
                    String[] stringOracion;
                    stringOracion = line2.split(" ");
                    for(int y=0; y<stringOracion.length; y++){
                        System.out.print("*"+stringOracion[y]+"* ");
                    }
                }
                diccionario.setValue(lista.get(0));
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
