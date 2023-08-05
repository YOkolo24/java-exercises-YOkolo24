package com.cbfacademy.accounts;

public class Account {
    
    protected double balance;
    protected String accountNumber;

    public Account (double balance, String accountNumber) {

        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public double deposit (double moneyIn) {
        if (moneyIn >= 0) {
        this.balance += moneyIn;
        return this.balance;
        } else {
            System.out.println("Invalid input. Value must be above 0");
            return 0;
        }
    }
    public double withdrawal (double moneyOut) {
        if ((moneyOut > 0) && (moneyOut <= balance)) {
        this.balance -= moneyOut;
        return this.balance;
        } else {
            System.out.println("Invalid input. Cannot withdraw amount more than available balance and cannot withdraw value less than 0.");
            return 0;
        }
    }
}
