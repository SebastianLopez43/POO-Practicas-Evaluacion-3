package eva3_4_null_pointer_exception;

/**
 * @author José Sebastian López Ibarra
 * Friday May 06 2022
 */

public class EVA3_4_NULL_POINTER_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Person per1 =  new Person("Sebastian");
        Person per1 = null;
        print(per1);
    }

    public static void print(Person p) {
        System.out.println("Name: " + p.getName());
    }
}

class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}