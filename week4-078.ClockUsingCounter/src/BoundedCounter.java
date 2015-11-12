/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Smart
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if (this.value < this.upperLimit) {
            this.value += 1;
        }
        else {
            this.value = 0;
        }
            
    }

    public String toString() {
        if (this.value < 10) {
            String return_value = "0" + this.value;
            return return_value;
        }
        else {
            String return_value = "" + this.value;
            return return_value;
        }
            
                
    }
    
    public int getValue() {
        return this.value;
}
    
    public void setValue(int value) {
        
        if (!(value < 0 || value > this.upperLimit)) {
            this.value = value;
        }
    }
}
