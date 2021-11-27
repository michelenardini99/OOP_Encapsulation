package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class StrictBankAccount implements BankAccount{
    
    private int userID;
    private double balance;
    private int nTransactions;
    private static double ATM_TRANSACTION_FEE = 1;

    public StrictBankAccount(int userID, double balance) {
        this.userID = userID;
        this.balance = balance;
    }

    @Override
    public void withdraw(int usrID, double amount) {
        if(this.userID == usrID && amount <= this.balance) {
            this.nTransactions++;
            this.balance-=amount;
        }
    }

    @Override
    public void deposit(int usrID, double amount) {
        if(this.userID == usrID) {
            this.nTransactions++;
            this.balance+=amount;
        }
    }

    @SuppressWarnings("static-access")
    @Override
    public void depositFromATM(int usrID, double amount) {
        if(this.userID == usrID) {
            this.nTransactions++;
            this.balance+=(amount-this.ATM_TRANSACTION_FEE);
        }
    }

    @SuppressWarnings("static-access")
    @Override
    public void withdrawFromATM(int usrID, double amount) {
        if(this.userID == usrID && amount <= (this.balance+this.ATM_TRANSACTION_FEE)) {
            this.nTransactions++;
            this.balance-=(amount+this.ATM_TRANSACTION_FEE);
        }
    }

    @Override
    public void chargeManagementFees(int usrID) {
        this.balance -= 5 + this.nTransactions;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public int getTransactionsCount() {
        return this.nTransactions;
    }

}
