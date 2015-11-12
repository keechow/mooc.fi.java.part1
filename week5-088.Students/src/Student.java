/*
 EXERCISE 88.1: CLASS STUDENT
Implement class Student that holds the following information about a student:

name (String)
studentNumber (String)
The class should have the following methods:

A constructor that initializes the name and the student number with the given parameters.
getName, that returns the student name
getStudentNumber, that returns the student number
toString, that returns a String representation of the form: Pekka Mikkola (013141590)
 */
public class Student {
    private String name;
    private String studentNumber;
    
public Student (String studentName, String studentNum) {
    this.name = studentName;
    this.studentNumber = studentNum;
}

public String getName() {
    return this.name;
}

public String getStudentNumber() {
    return this.studentNumber;
}

public String toString () {
    String return_string = this.name + " (" + this.studentNumber + ")";
    return return_string;
}
    
}
