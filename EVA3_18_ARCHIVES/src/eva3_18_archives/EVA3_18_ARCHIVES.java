package eva3_18_archives;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author José Sebastian López Ibarra
 * Tuesday May 23 2022
 */

public class EVA3_18_ARCHIVES {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //FileInputStream
        
        try {
            // Rute:
            FileInputStream archive = new FileInputStream("C:/POO/Archivo.txt");
            
            int caracter = archive.read();
            
            while (caracter != -1) {
                System.out.println("Leer: " + caracter);
                caracter = archive.read();
            }
            
            // Leer archivo caracter por caracter.
            /* while (caracter != -1) {
                System.out.print((char)caracter);
                caracter = archive.read();
            } */
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }    
}