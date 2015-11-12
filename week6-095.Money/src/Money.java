
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int newCents = this.cents + added.cents();
        int newEuros = this.euros + added.euros();
       
        Money newTotal = new Money(newEuros, newCents);
        
        return newTotal;
        }
     
    public boolean less (Money compared) {
        if ((this.euros == compared.euros()) && (this.cents < compared.cents())) {
          return true;
        }
        
        else return this.euros < compared.euros();
    }  
    
    public Money minus (Money decremented) {
        int newCents = this.cents - decremented.cents();
        int newEuros = this.euros - decremented.euros();
        
        if (newCents < 0) {
            newCents += 100;
            newEuros -= 1;
        }
        
        if (newEuros < 0) {
            newCents = 0;
            newEuros = 0;
        }
        Money newTotal = new Money(newEuros, newCents);
        
        return newTotal;
    }

    
}
    

