package eva3_9_exception_class;
//import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Tuesday May 10 2022
 */

public class EVA3_9_EXCEPTION_CLASS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        
        try { // Código que puede fallar.
            System.out.println("Introduce un número entero: ");
            num1 = input.nextInt();
        
            System.out.println("Introduce otro número entero: ");
            num2 = input.nextInt();
            
            System.out.println("\nDivisión: " + (num1/num2));
        } catch (Exception e) { // Lo que sucede si se produce una expeción.
            // System.out.println("Se produjo una división entre cero");
            e.printStackTrace();
        } /* catch (InputMismatchException e) {
            System.out.println("Introduce un número válido.");
        } */
        
        System.out.println("\nFin del programa.");
    }    
}