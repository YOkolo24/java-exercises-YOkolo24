package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

    private double interest = 3;

    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    public double addInterest() {
        double interestToAdd = (balance/100) * interest;
        return super.deposit(interestToAdd);
    }
    // the below  code on lines 16 to 20 can be used to override, but the code on lines 11 to 13 are enough for this case
    //@Override
    //public double deposit (double moneyIn) {
       //double interestToAdd = (balance/100) * interest; 
       //return super.deposit(interestToAdd);
    //}
}

        