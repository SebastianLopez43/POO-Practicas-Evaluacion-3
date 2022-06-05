package eva3_21_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author José Sebastian López Ibarra 
 * Tuesday May 31 2022
 */

public class EVA3_21_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Convertir nuestro objetos a bits.
        // Especificar que objetos (clases) sen serializables

        Person person = new Person("Sebastian", "López");
        write(person);
    }

    public static void write(Object o) {

        // Save Objects
        try {
            FileOutputStream openArchive = new FileOutputStream("D:/POO/Archivo2.txt");
            ObjectOutputStream saveObj = new ObjectOutputStream(openArchive);
            saveObj.writeObject(o);
            saveObj.flush();
            saveObj.close();        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void read() {

        // Read objects
        try {
            FileInputStream openArchive = new FileInputStream("D:/POO/Archivo2.txt");
            ObjectInputStream readObj = new ObjectInputStream(openArchive);
            readObj.readObject(); // Return an object of the Object Class
            
            Person person1 = (Person)readObj.readObject();
        
            System.out.println("Nombre " + person1.getName() + " " + person1.getLastName());
            readObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}

class Person implements Serializable {

    private String name, lastName;

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}