public class NumberStatistics {
    private int amountOfNumbers;
    private int totalSum;
    
    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.totalSum = 0;
    }
    
    public void addNumber(int number) {
        // code here
       this.amountOfNumbers += 1;
       this.totalSum += number;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;        
        // code here
    }
    
    public int sum() {
        return this.totalSum;
    }
    
    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0.0;
        }
        else {
        return ((double)this.totalSum / this.amountOfNumbers);
        }
    }
        
}
    