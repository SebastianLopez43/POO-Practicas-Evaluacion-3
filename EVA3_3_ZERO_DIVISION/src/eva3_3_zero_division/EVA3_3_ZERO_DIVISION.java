package eva3_3_zero_division;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Friday May 06 2022
 */

public class EVA3_3_ZERO_DIVISION {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");
        num1 = input.nextInt();
        
        System.out.println("Introduce un número entero: ");
        num2 = input.nextInt();
        
        System.out.println("\nDivisión: " + (num1/num2));
    }    
}