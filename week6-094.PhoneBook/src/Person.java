
import java.util.ArrayList;

public class Person {
    private String name;
    private String phone;

    
    public Person(String person_name, String phone_num ) {
        this.name = person_name;
        this.phone = phone_num;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getNumber() {
        return this.phone;
    }
    
    public void changeNumber(String phone_num) {
        this.phone = phone_num;
    }
    
    public String toString() {
        String return_string = getName() + " number: " + getNumber();
        return return_string;
    }
    
  
    
}
