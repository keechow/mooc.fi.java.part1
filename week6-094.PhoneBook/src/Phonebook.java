/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Smart
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> book;
    
    public Phonebook() {
        this.book = new ArrayList<Person>();
    }
    
    public void add(String person_name, String phone_num) {
 //       System.out.println(person_name);

        Person newPerson = new Person(person_name, phone_num);
        this.book.add(newPerson);
    }
    
    public void printAll() {
        for (Person each : book) {
            System.out.println(each);
        }
    }
    
    public String searchNumber(String name) {
        for (Person each : this.book) {
            if (each.getName().equals(name)) {
                return each.getNumber();
            }           
        }
        return "number not known";
        
    }
}
