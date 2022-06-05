package eva3_22_serializable_array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author José Sebastian López Ibarra
 * Wednesday June 01 2022
 */

public class EVA3_22_SERIALIZABLE_ARRAY {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Collections
        // Tipos de Datos Genéricos ("<>") - Especificar un tipo de dato: Guradar datos de distintos objetos
        ArrayList<Person> myPersonList = new ArrayList(); // 0
        myPersonList.add(new Person("Karina", "Ibarra")); // 1
        myPersonList.add(new Person("Sebastian", "López")); // 2
        myPersonList.add(new Person("Santiago", "López")); // 3
        myPersonList.add(new Person("Sofia", "López")); // 4
        
        // JAVA -> Lists, Arrays, etc.  0 -> n-1
        
        System.out.println(myPersonList.get(0));
        
        write(myPersonList);
    }
    
     public static void write(Object o){
        
        try {
            FileOutputStream openArchive = new FileOutputStream("D:/POO/Archivo3.txt");
            ObjectOutputStream saveObj = new ObjectOutputStream(openArchive);
            saveObj.writeObject(o);
            saveObj.flush();
            saveObj.close();
            } catch (FileNotFoundException ex){
                Logger.getLogger(EVA3_22_SERIALIZABLE_ARRAY.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EVA3_22_SERIALIZABLE_ARRAY.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
     public static void read(){
        
        try {
            FileInputStream openArchive = new FileInputStream("D:/POO/Archivo3.txt");
            ObjectInputStream readObj = new ObjectInputStream(openArchive);
            readObj.readObject();
            
            ArrayList<Person> myPersonList = (ArrayList<Person>)readObj.readObject();
            
            for (int i = 0; 1 < myPersonList.size(); i++) {
                Person per1 = myPersonList.get(i);
                System.out.println("Nombre: " + per1.getName() + " " + per1.getLastName());
            }
            
            readObj.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }    
    }
}

class Person implements Serializable{
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
