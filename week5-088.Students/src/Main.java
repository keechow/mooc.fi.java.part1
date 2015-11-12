
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true) {
            System.out.println("name: ");
            String student_name = reader.nextLine();
            if (student_name.equals("")) {
                break;
            }
            else {
                System.out.println("studentnumber: ");
                String student_number = reader.nextLine();
                Student student = new Student(student_name, student_number);
                list.add(student);
            }
        }
        
        for(Student each : list) {
            System.out.println(each);
        }
        
        while(true) {
            System.out.println("Give search term: ");
            String search_term = reader.nextLine();
            
            if (search_term.equals("")) {
                break;
            }
            
            else {
                for (Student each : list) {
                    if (each.getName().contains(search_term)) {
                        System.out.println("Result:");
                        System.out.println(each);
                    }
                }
            }
        }
        
    }
}