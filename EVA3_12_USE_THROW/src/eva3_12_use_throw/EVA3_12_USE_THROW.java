package eva3_12_use_throw;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author José Sebastian López Ibarra 
 * Wednesday May 11 2022
 */

public class EVA3_12_USE_THROW {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int age;
        
        try {
            System.out.println("Introduce tu edad (número positivo): ");
            age = input.nextInt();
            
            if (age < 0)
                throw new Exception(age + " no es una edad válida.");
            
            System.out.println("Tu edad es: " + age);
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nFin del programa.");
    }
    
}
