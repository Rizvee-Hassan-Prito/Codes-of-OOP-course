/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproblem8b2;

/**
 *
 * @author User
 */
public class product {

    /**
     * @param args the command line arguments
     */
    public static void productCheck(int weight) throws MyException {
        if (weight < 100) {
            throw new MyException("Product is invalid.");
        } else {
            System.out.println(weight);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input=new java.util.Scanner(System.in);
        product p = new product();
        try {
            System.out.println("Enter product Weight:");
            productCheck(input.nextInt());
        } catch (MyException e) {
            System.out.println(e);
        }
    }

}

class MyException extends Exception {

    MyException(String s) {
        super(s);
    }
}
