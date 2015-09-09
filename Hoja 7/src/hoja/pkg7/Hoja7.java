/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.pkg7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Ma. Belen
 */
public class Hoja7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File diccionario= new File ("diccionario.txt");
        /*try{
            BufferedReader br = new BufferedReader(new FileReader(diccionario));
                try { //array de tipo numeral que implementa comparable
                    int z=0;
                    for(String line; (line = br.readLine()) != null; ){
                        selectionArray[z] = new ObjetoNumerales(Integer.parseInt(line));
                        insertionArray[z] = new ObjetoNumerales(Integer.parseInt(line));
                        quickArray[z] = new ObjetoNumerales(Integer.parseInt(line));
                        radixArray[z] = new ObjetoNumerales(Integer.parseInt(line));
                        z++;
                    }
                }
                catch(IOException ex) {
                        Logger.getLogger(Hoja3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        catch(FileNotFoundException ex) {
            Logger.getLogger(Hoja3.class.getName()).log(Level.SEVERE, null, ex);
            }*/
    }
    
}
