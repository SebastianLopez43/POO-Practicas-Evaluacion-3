package eva3_5_try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author José Sebastian López Ibarra
 * Monday May 09 2022
 */

public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age = 0;

        System.out.println("Introduce tu edad: ");

        try {
            age = input.nextInt();
        } catch (InputMismatchException i) {
            // i.printStackTrace();
            System.out.println("\n¡Falló la captura!");
        }
        
        System.out.println("\nTu edad es : " + age);
        
        if (age < 18) {
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Eres mayor de edad.");
        }
    }    
}