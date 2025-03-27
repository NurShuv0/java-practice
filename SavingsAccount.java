class SavingsAccount {
    private static double annualInterestRate;
    private double balance; 
    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void calculateMonthlyInterest() {
        double monthlyInterest = (balance * annualInterestRate) / 12.0;
        balance += monthlyInterest;
    }
    public static void setAnnualInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount(25500.00);
        SavingsAccount account2 = new SavingsAccount(35400.00);
        SavingsAccount.setAnnualInterestRate(0.02);
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        System.out.printf("Account 1 new balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account 2 new balance: $%.2f\n", account2.getBalance());
        SavingsAccount.setAnnualInterestRate(0.03);
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        System.out.printf("Account 1 new balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account 2 new balance: $%.2f\n", account2.getBalance());
    }
}