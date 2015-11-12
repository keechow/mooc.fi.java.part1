import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private MyDate today;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
        
    }
    
    public MyDate today() {
        int dd = Calendar.getInstance().get(Calendar.DATE);
        int mm = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int yy = Calendar.getInstance().get(Calendar.YEAR);
        MyDate todayDate = new MyDate(dd, mm , yy);
        return todayDate;
    }
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        this.today = today();
        return this.birthday.differenceInYears(this.today);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        
        if(this.age() > compared.age()) {
            return true;
        }
        
        else if (this.age() < compared.age()) {
            return false;
        }
        
        else {
            if (this.birthday.getBirthMonth() > compared.birthday.getBirthMonth()) {
                return true;
            }
            else if (this.birthday.getBirthMonth() < compared.birthday.getBirthMonth()) {
                return false;
            }
            else {
                if (this.birthday.getBirthDay() > compared.birthday.getBirthDay()) {
                    return true;
                }
                return false;
            }
            
        }
            

    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this.name = name;
        this.birthday = today();
        
    }
            
}
