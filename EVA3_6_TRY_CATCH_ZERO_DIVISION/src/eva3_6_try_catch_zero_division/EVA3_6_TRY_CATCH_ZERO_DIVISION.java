package eva3_6_try_catch_zero_division;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author José Sebastian López Ibarra
 * Monday May 09 2022
 */

public class EVA3_6_TRY_CATCH_ZERO_DIVISION {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        
        System.out.println("Introduce un número entero: ");
        
        try {
            num1 = input.nextInt();
        } catch (InputMismatchException i) {
            i.printStackTrace();
        }
        
        System.out.println("Introduce otro número entero: ");
        
        try {
            num2 = input.nextInt();
        } catch (InputMismatchException i) {
            i.printStackTrace();
        }
        
        try {
            System.out.println("\nDivisión: " + (num1/num2));
        } catch(ArithmeticException i) {
            //i.printStackTrace();
            System.out.println("\nNo se puede realizar una divisón entre cero.");
        }
        
        System.out.println("\nFin del programa.");
    }    
}