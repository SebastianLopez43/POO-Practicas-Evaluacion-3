package eva3_10_finally;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author José Sebastian López Ibarra
 * Wednesday May 11 2022
 */

public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1;

        try {
            System.out.println("Introduce un número: ");
            num1 = input.nextInt();
            System.out.println("El número es: " + num1);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally { // Esta sección siempre se ejecuta
            System.out.println("ESTA LÍNEA DEBE EJECUTARSE.");
        }

        System.out.println("\nFin del programa.");

    }    
}