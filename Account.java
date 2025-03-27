public class Account {
    private String Account_number;
    private double balance;
    public Account(String AC_Number, double balance) {
        if (AC_Number == null || AC_Number.trim().isEmpty()) {
            System.err.println("Error: Account number should not null.Try again");
            this.Account_number = null; 
            this.balance = 0.0;
        } else if (balance < 0) {
            System.err.println("Error: Balance cannot be negative.Try again");
            this.Account_number = AC_Number;
            this.balance = 0.0; 
        } else {
            this.Account_number = AC_Number;
            this.balance = balance;
        }
    }
    public String Account_Number() {
        return Account_number;
    }
    public double Balance() {
        return balance;
    }
    public static void main(String[] args) {
        Account account1 = new Account("103576", 10000.0);
        Account account2 = new Account("103639", 5.0);
        Account account3 = new Account(null, 1500.0);
        Account account4 = new Account("", 2000.0);
        Account account5 = new Account("11223", -100.0);
        
        if (account1.Account_Number() != null) {
            System.out.println("Account Number: " + account1.Account_Number() + ", Balance: " + account1.Balance());
        }
        if (account2.Account_Number() != null) {
        System.out.println("Account Number: " + account2.Account_Number() + ", Balance: " + account2.Balance());
        }
        if(account3.Account_Number() != null){
            System.out.println("Account Number: " + account3.Account_Number() + ", Balance: " + account3.Balance());
        }
    }
}