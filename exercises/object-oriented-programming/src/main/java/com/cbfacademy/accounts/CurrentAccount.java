package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
   
    private double overdraftLimit = 1000;

    public CurrentAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public double withdrawal (double moneyOut) {
        double totalBalance = balance + overdraftLimit;
        if ((moneyOut > 0) && (moneyOut <= totalBalance)) {
            this.balance -= moneyOut;
            return this.balance;
            } else {
                System.out.println("Invalid input. Cannot withdraw amount less than 0. Cannot withdraw amount more than overdraft limit.");
                return 0;
            }
        }
}
