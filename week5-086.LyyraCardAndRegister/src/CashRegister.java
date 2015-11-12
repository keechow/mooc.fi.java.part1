
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double econ_lunch_price = 2.50;
        if (cashGiven >= econ_lunch_price) {
            this.cashInRegister += econ_lunch_price;
            this.economicalSold += 1;
            return (cashGiven - econ_lunch_price);
        }
        else {
            return cashGiven;
        }
    }
    
    public boolean payEconomical(LyyraCard user_card) {
        double econ_lunch_price = 2.50;
        double user_cash = user_card.balance();
        if (user_cash >= econ_lunch_price){
            this.economicalSold += 1;
            user_card.pay(econ_lunch_price);
            return true;
        }
        else {
            return false;
        }
    } 
    
    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double gourmet_lunch_price = 4.00;
        if (cashGiven >= gourmet_lunch_price) {
            this.cashInRegister += gourmet_lunch_price;
            this.gourmetSold += 1;
            return (cashGiven - gourmet_lunch_price);
        }
        else {
            return cashGiven;
        }
    }
    
    public boolean payGourmet(LyyraCard user_card) {
        double gourmet_lunch_price = 4.0;
        double user_cash = user_card.balance();
        if (user_cash >= gourmet_lunch_price){
            this.gourmetSold += 1;
            user_card.pay(gourmet_lunch_price);
            return true;
        }
        else {
            return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard user_card, double sum) {
        if (sum > 0) {
            this.cashInRegister += sum;
            user_card.loadMoney(sum);
        }
    }
    


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}