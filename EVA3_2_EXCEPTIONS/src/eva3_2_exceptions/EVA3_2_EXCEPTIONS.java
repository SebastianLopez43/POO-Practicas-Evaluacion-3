package eva3_2_exceptions;
import java.util.Scanner;
        
/**
 * @author José Sebastian López Ibarra
 * Friday May 06 2022
 */

public class EVA3_2_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce tu edad: ");
        age = input.nextInt();
        
        if (age<18) {
            System.out.println("Tu edad es: " + age + " años. \nEres menor de edad.");
        } else {
            System.out.println("Tu edad es: " + age + " años. \nEres mayor de edad.");
        }
    }   
}