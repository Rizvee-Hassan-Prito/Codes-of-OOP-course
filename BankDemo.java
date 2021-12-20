/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author User
 */


    /**
     * @param args the command line arguments
     */
    class insufficientFund extends java.lang.Exception {

        insufficientFund(String s) {
            super(s);
        }
    }

    class overflow extends java.lang.Exception {

        overflow(String s) {
            super(s);
        }
    }

    class IlligalArgumentValueException extends java.lang.Exception {

        IlligalArgumentValueException(String s) {
            super(s);
        }
    }

    class Account {

        private int balance = 10000000;

        public int balance() {
            return balance;
        }

        public void withdraw(int amount) throws insufficientFund {
            if (amount > balance) {
                //balance = balance - amount;
               throw new insufficientFund("Insufficient Fund.");
            }
            else{
               balance = balance - amount;
            }
        }

        public void deposit(int amount) throws IlligalArgumentValueException, overflow {
            if (amount <= 0) {
               throw new IlligalArgumentValueException("Illigal Argument Value.");
            }
            if (amount + balance > 1000000) {
                throw new overflow("Overflow.");
            }
        }
    }
public class BankDemo {
         public static void main(String[] args) {
             Scanner input=new Scanner (System.in);
             Account a=new Account ();
         try{
             a.withdraw(input.nextInt());
             a.deposit(input.nextInt());
             
         }
         catch(insufficientFund e){
             System.out.println(e);
         }
         catch(IlligalArgumentValueException e){
             System.out.println(e);
         }
         catch(overflow e){
             System.out.println(e);
         }
    }
}

