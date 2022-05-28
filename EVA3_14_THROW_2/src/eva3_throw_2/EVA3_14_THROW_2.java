package eva3_throw_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Monday May 16 2022
 */

public class EVA3_14_THROW_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Person person = new Person();
        person.setName("José Sebastian López Ibarra");
        
        try {
            person.setAge(captureAge());
        } catch (Exception e){
            e.printStackTrace();
        }
        
        try {
            Person person1 = new Person("José Sebastian López Ibarra", captureAge());
        } catch (Exception e) {
            e.printStackTrace();
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