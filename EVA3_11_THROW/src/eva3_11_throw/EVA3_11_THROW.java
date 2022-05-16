package eva3_11_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author José Sebastian López Ibarra 
 * Wednesday May 11 2022
 */

public class EVA3_11_THROW {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        try {
            throw new Exception("Mi primera excepción");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
