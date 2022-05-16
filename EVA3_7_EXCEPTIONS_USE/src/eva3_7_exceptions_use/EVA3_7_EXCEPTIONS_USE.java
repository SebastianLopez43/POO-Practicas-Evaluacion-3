package eva3_7_exceptions_use;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Tuesday May 10 2022
 */

public class EVA3_7_EXCEPTIONS_USE {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {        
        
        Scanner input = new Scanner(System.in);
        int age = 0;
        boolean data = true; // El usuario siempre se equivoca
        
        do {
            try {
                System.out.println("Introduce tu edad: ");
                
                age = input.nextInt();
                
                data = false;
                
            } catch (InputMismatchException i) {
                // i.printStackTrace();
                System.out.println("\n" + "'" + input.next() + "' no es un número válido. Introduce un número entero.\n");
            } 
        } while (data);        
        
        System.out.println("\nTu edad es : " + age);
        
        if (age < 18) {
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Eres mayor de edad.");
        }
    }    
}