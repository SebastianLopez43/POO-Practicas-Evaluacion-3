package eva3_.pkg15_throw_person;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Monday May 16 2022
 */

public class EVA3_15_THROW_PERSON {

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
    
    public static int captureAge() throws Exception {
        Scanner input = new Scanner(System.in);
        int valor = 0;

        System.out.println("Introduce tu edad: ");

        try {
            valor = input.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("Introduce un número entero.");
        }

        return valor;
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) throws Exception{
        this.name = name;
        /*if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            throw new Exception("La edad introducida no es válida.");
        } */
        setAge(age);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws Exception {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            throw new Exception("La edad introducida no es válida.");
        }
    }
}