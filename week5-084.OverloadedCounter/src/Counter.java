/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Smart
 */
public class Counter {
    private int number;
    private boolean check_value;
    
    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check_value = check;
        
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0,true);
        
    }
    
    public Counter(){
        this(0, false);
    }
    
    public void check(){
        if (this.number <= 0) {
            this.number = 0;
        }
        
    }
    
    public int value() {
        return this.number;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void increase (int increaseAmount) {
        if (!(increaseAmount < 0)) {
           this.number += increaseAmount; 
        }        
    }
    
    public void decrease (int decreaseAmount) {
        if (!(decreaseAmount < 0)) {
            this.number -= decreaseAmount;
            if (this.check_value && this.number <= 0) {
                this.number = 0; 
            }
        }
    }
    
    
    
}
