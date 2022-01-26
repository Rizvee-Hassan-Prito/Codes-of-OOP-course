/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8problema.pkg1;


/**
 *
 * @author User
 */
public class Lab8ProblemA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner(System.in);
        try {
            int a = Integer.parseInt(input.next());
            int b = Integer.parseInt(input.next());
            Calculator o = new Calculator(a, b);
            o.Add();
            o.Substraction();
            o.Diviosion();
            o.Multiplication();
        } catch (NumberFormatException e) {
            System.out.println("Please Enter Numbers.");
        }

    }

}

class Calculator {

    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void Add() {
       try {
            if (a < 0 || b < 0) {
                throw new ArithmeticException();
            } else {
                System.out.println("Result of Additon is:" + (a + b));

            }
        } catch (ArithmeticException e) {
            System.out.println("Wrong Input Given for Additon.");
        }
    }

    void Substraction() {
       try {
            if (a < 0 || b < 0) {
                throw new ArithmeticException();
            } else {
                System.out.println("Result of Substraction is:" + (a - b));

            }
        } catch (ArithmeticException e) {
            System.out.println("Wrong Input Given for Substraction.");
        }
    }

    void Diviosion() {
        try {
            if (a == 0 || b == 0) {
                throw new ArithmeticException();
            } else {
                System.out.println("Result of Diviosion is:" + (a / b));

            }
        } catch (ArithmeticException e) {
            System.out.println("Wrong Input Given for Diviosion.");
        }
    }

    void Multiplication() {
        try {
            if (a == 0 || b == 0) {
                throw new ArithmeticException();
            } else {
                System.out.println("Result of Diviosion is:" + (a / b));

            }
        } catch (ArithmeticException e) {
            System.out.println("Wrong Input Given for Multiplication.");
        }
    }
}
