package eva3_13_capture_age;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author José Sebastian López Ibarra
 * Monday May 16 2022
 */

public class EVA3_13_CAPTURE_AGE {

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
                                
                if(age < 0)
                    throw new Exception(age + " no es una edad válida.");

                data = false;
            } catch(InputMismatchException e) {
                System.out.println(input.next() + " no es número válido.");
            } catch (Exception e) {
                // i.printStackTrace();
                //System.out.println("\n" + "'" + input.next() + "' no es un número válido. Introduce un número entero.\n");                
                e.printStackTrace();
            }  
        } while (data);        
        
        System.out.println("\nTu edad es : " + age);
        
        if (age < 18 && age > 1) {
            System.out.println("Eres menor de edad.");
        } else if (age > 18 && age < 90){
            System.out.println("Eres mayor de edad.");
        } else if (age <= 0) {
            System.out.println("La edad no es válida.");
        }
    }    
}