package eva3_1_stack_overflow;

/**
 * @author José Sebastian López Ibarra
 * May Monday 02 200
 */

public class EVA3_1_STACK_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    
    public static int cont = 0;
    
    public static void main(String[] args) {
        int x = 10;
        finishStack();
    
    // Stack es la memoria para la variables locales y llamadas a función.
    }
    
    public static void finishStack(){
        cont = cont + 1;
        System.out.println(cont);
        finishStack(); // Recursividad
        
        // Stack Overflow - Error
        // Desbordamiento de pila (stack)
    }  
}