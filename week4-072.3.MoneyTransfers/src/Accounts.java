
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
       
        
        Account account1 = new Account("A", 100.0);
        Account account2 = new Account("B", 0.0);
        Account account3 = new Account("C", 0.0);
    
        transfer(account1, account2, 50.0);
        transfer(account2, account3, 25.0);
    
}
    public static void transfer (Account from, Account to, double amount) {
            from.withdrawal(amount);
            to.deposit(amount);
    }


}
