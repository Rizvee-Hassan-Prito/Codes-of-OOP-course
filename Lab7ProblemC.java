/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7problemc;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Lab7ProblemC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner(System.in);

        ArrayList<Account> a = new ArrayList<Account>();
        a.add(new Account(1122, 20000, 4.5));
        a.add(new Account(1123, 30000, 5.5));
        a.add(new Account(1124, 40000, 6.5));
        a.add(new Account(1125, 50000, 7.5));

        a.get(0).deposit(1000.00);
        System.out.println("Balance for Account 1 after deposit: " + a.get(0).getBalance());
        a.get(0).withdraws(1000.00);
        System.out.println("Balance for Account 1 after withdraw: " + a.get(0).getBalance());

        a.get(1).deposit(2000.00);
        System.out.println("Balance for Account 2 after deposit: " + a.get(1).getBalance());
        a.get(1).withdraws(2000.00);
        System.out.println("Balance for Account 2 after withdraw: " + a.get(1).getBalance());

        a.get(2).deposit(3000.00);
        System.out.println("Balance for Account 3 after deposit: " + a.get(2).getBalance());
        a.get(2).withdraws(3000.00);
        System.out.println("Balance for Account 3 after withdraw: " + a.get(2).getBalance());

        a.get(3).deposit(4000.00);
        System.out.println("Balance for Account 4 after deposit: " + a.get(3).getBalance());
        a.get(3).withdraws(4000.00);
        System.out.println("Balance for Account 4 after withdraw: " + a.get(3).getBalance());

        System.out.println("Press (1) for creating a Checking Account\n"
                + "Press (2) for creating a Savings Account");

        int c = input.nextInt();
        if (c == 1) {
            System.out.println("This is Checking Accounts:");
            System.out.println();
            a.get(0).object1();
            Account c1 = new CheckingAccount(100);
            c1.object1();
            a.get(1).object1();
            Account c2 = new CheckingAccount(200);
            c2.object1();
            a.get(2).object1();
            Account c3 = new CheckingAccount(300);
            c3.object1();
            a.get(3).object1();
            Account c4 = new CheckingAccount(400);
            c4.object1();

        } else {
            System.out.println("This is Savings Accounts:");
            System.out.println();
            a.get(0).object1();
            Account s1 = new SavingsAccount(new java.math.BigInteger("4354378894533565"), 15010);
            s1.object1();
            a.get(1).object1();
            Account s2 = new SavingsAccount(new java.math.BigInteger("4354378894533243"), 16010);
            s2.object1();
            a.get(2).object1();
            Account s3 = new SavingsAccount(new java.math.BigInteger("4354378894533456"), 17010);
            s3.object1();
            a.get(3).object1();
            Account s4 = new SavingsAccount(new java.math.BigInteger("4354378894533459"), 18010);
            s4.object1();

        }

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

    void object1() {
        System.out.println("Account ID: " + getId() + " Current Balance: "
                + getBalance() + " Annual Interest Rate: " + getAnnualInterestRate()
                + " Monthly Interest Amount: " + getMonthlyInterestAmount());
    }
}

//Lab6 Problem B
class CheckingAccount extends Account {

    public double overdraftLimit;

    CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    void object1() {
        System.out.println("overdraftLimit: " + overdraftLimit);
    }
}

class SavingsAccount extends Account {

    java.math.BigInteger CreditCardNumber;
    int CreditCardBalance;

    public SavingsAccount(java.math.BigInteger CreditCardNumber, int CreditCardBalance) {
        this.CreditCardNumber = CreditCardNumber;
        this.CreditCardBalance = CreditCardBalance;
    }

    double getCreditBalance() {
        return getBalance() * 3;
    }

    void object1() {
        System.out.println("Credit Card Number: " + CreditCardNumber + " Credit Balance: " + CreditCardBalance);
    }
}

