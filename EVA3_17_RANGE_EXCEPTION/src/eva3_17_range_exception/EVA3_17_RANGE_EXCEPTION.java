package eva3_17_range_exception;

/**
 * @author José Sebastian López Ibarra
 * Tuesday May 17 2022
 */


public class EVA3_17_RANGE_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Person person = new Person ("Sebastian López", -19);
        } catch (RangeException e) {
            e.printStackTrace();
        }
    }    
}

class RangeException extends Exception {

    public RangeException() {
    }

    public RangeException(String message) {
        super(message);
    }
    
}

class Person{
    private String name;
    private int age;

    public Person() {
    }
    
    public Person(String name, int age) throws RangeException{
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
    public void setAge(int age) throws RangeException {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            throw new RangeException("Rango de edad no válido.");
        }
    }
}