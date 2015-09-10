package hoja.pkg7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        File fileTexto= new File ("texto.txt");
        BinaryTree diccionario= new BinaryTree(null);
        BinarySearchTree funciones = new BinarySearchTree();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileDiccionario));
            try { 
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
                diccionario.setValue(lista.get(0));
                for (int x=1; x<lista.size(); x++){
                    funciones.insertNode(diccionario, lista.get(x));
                }
                
                System.out.println("DICCIONARIO INGLES-ESPANOL\n\nPalabras en el diccionario:\n");
                funciones.printInOrder(diccionario);
                System.out.println("\n");
            }
            catch(Exception e){
            }
        }
        catch(Exception e){
            
        }
        /*try{
            BufferedReader br = new BufferedReader(new FileReader(fileTexto));
            ArrayList<String> palabras = new ArrayList<String>();
            ArrayList<String> palabras2 = new ArrayList<String>();
            String palabra;
            int size, separador;
                    
            try{
                for(String line; (line = br.readLine()) != null; ){
                size=line.length();
                while (size>0){
                    separador=line.indexOf(" ");
                    if (separador<0){
                        if(line.contains(".")){
                            size=line.length();
                            line=line.substring(0, size-1);
                        }
                        palabras.add(line);
                        System.out.println(line);
                        break;
                    }
                    palabra= line.substring(0, separador);
                    palabras.add(palabra);
                    line=line.substring(separador+1);
                    System.out.println(palabra);
                }
                }
                funciones.busqueda(diccionario);
                for (int x=1; x<palabras.size(); x++){
                    palabra=palabras.get(x);
                    //System.out.println(palabra);
                }
            }
            catch(Exception e){
                
            }
            
        }
        catch(Exception e){
            
        }*/
    }
    
}

