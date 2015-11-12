/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *
 * @author Smart
 */
public class MyClass extends SuperClass {
    
    public void printOut(){
        System.out.println("This is sub-class. Lower class");
    }
    
   
    public static void main(String[]args){
        
        MyClass ourClass = new MyClass();
        ourClass.printOut();      
        ourClass.super.printOut();
    }   
   
}
