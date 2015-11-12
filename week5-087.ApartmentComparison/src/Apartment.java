
public class Apartment {
     
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int apartmentPrice;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.apartmentPrice = this.squareMeters * this.pricePerSquareMeter;
        
    }
    
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(this.apartmentPrice - otherApartment.apartmentPrice);
        
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        return (this.apartmentPrice > otherApartment.apartmentPrice);
    }
    
}

/*
EXERCISE 87.3: MORE EXPENSIVE THAN
Implement the method public boolean moreExpensiveThan(Apartment otherApartment) that 
returns true if the Apartment-object for which the method is called (this) 
has a higher price than the apartment object given as parameter (otherApartment).

EXERCISE 87.2: PRICE DIFFERENCE
Implement the method public int priceDifference(Apartment otherApartment) that 
returns the absolute value of the price difference of the Apartment object 
for which the method is called (this) and the apartment object given as parameter (otherApartment). 
The price of an apartment is squareMeters * pricePerSquareMeter.


EXERCISE 87.1: LARGER
Implement the method public boolean larger(Apartment otherApartment) that 
returns true if the Apartment object for which the method is called (this) 
is larger than the apartment object given as parameter (otherApartment).
*/