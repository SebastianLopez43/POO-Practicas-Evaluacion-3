package eva3_.pkg6_custom_exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author José Sebastian López Ibarra
 * Tuesday May 17 2022
 */

public class EVA3_16_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int value = 0;
        boolean data = true;

        do {
            try {
            System.out.println("Introduce tu edad: ");
            value = input.nextInt();
            
            if (value < 0)
                throw new Exception(value + " no es una edad válida.");
            
            data = false;
            
        } catch (InputMismatchException e) {
            System.out.println(input.nextInt() + " no es un número válido.");
        }   catch (Exception ex) {
                ex.printStackTrace();
            }
        } while (data);
    }
}

// Custom Exception
// Exception Heredity

class CaptureException extends Exception {

    public CaptureException() {
    }

    public CaptureException(String message) {
        super(message);
    }   
}