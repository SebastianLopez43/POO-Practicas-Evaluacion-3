package eva3_20_write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author José Sebastian López Ibarra
 * Tuesday May 31 2022
 */

public class EVA3_20_WRITE {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Path rute = Paths.get("D:/POO/Archivo1.txt");
        
        OutputStream openArchive;
        OutputStreamWriter writeArchive;
        BufferedWriter writeText;
        
        try {
            openArchive = Files.newOutputStream(rute);
            writeArchive = new OutputStreamWriter(openArchive);
            writeText = new BufferedWriter (writeArchive);
            writeText.write("Hola mundo");
            writeText.flush();
            writeText.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
