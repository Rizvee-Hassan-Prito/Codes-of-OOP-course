/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6problemaandb;

/**
 *
 * @author User
 */
public class  Lab6ProblemAandB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account = new Account(1122, 20000, 4.5);
        account.withdraws(2500);
        account.deposit(3000);
        System.out.println(account.getId());
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterestAmount());
    }
}

class Account {

    private int id;
    private double balance;
    private double annualInterestRate = 0.0;

    Account() {

    }

    Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate / 100;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    double getMonthlyInterestRate() {
        double monthlyInterestRate = this.annualInterestRate / 12;
        return monthlyInterestRate;
    }

    double getMonthlyInterestAmount() {
        return balance * getMonthlyInterestRate();
    }

    void withdraws(double balance) {
        this.balance = this.balance - balance;
    }

    void deposit(double balance) {
        this.balance = this.balance + balance;
    }
}
//Lab6 Problem B
class CheckingAccount extends Account {

    double overdraftLimit;
}

class SavingsAccount extends Account {

    double getCreditBalance() {
        return getBalance() * 3;
    }
}
