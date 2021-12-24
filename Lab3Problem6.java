/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        double rand = Math.random();
        while (true) {
            outer:
            {
                System.out.println("Enter a number");
                Scanner input = new Scanner(System.in);
                double d = input.nextInt();
                if (d > rand) {
                    System.out.println("Too high, try again");
                } else {
                    System.out.println("Too low, try again");
                }
                if (d == rand) {
                    break outer;
                }
                System.out.println("random number: " +rand);
            }
        }
    }

}
