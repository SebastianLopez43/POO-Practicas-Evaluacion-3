package eva3_19_buffers;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

/**
 * @author José Sebastian López Ibarra
 * Wednesday May 25 2022
 */

public class EVA3_19_BUFFERS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Define rute
        Path rute = Paths.get("C:/POO/Archivo.txt");
        
        // Open the archive
        InputStream openArchive;
        
        // We read the archive
        InputStreamReader readArchive;
        
        // Byte to caracter convert
        BufferedReader readText;
        
        try {
            openArchive = Files.newInputStream(rute);
            readArchive = new InputStreamReader(openArchive);
            readText = new BufferedReader(readArchive); 
            String line = readText.readLine();
            
            while (line != null) {
                System.out.println(line);
                line = readText.readLine();
            }
            
            readText.close(); // Close the Stream
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }    
}