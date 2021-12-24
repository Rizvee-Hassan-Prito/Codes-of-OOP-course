/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Problem 5-A");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Problem 5-B");
        for (int i = 0; i <= d; i++) {
            for (int j = 1; j <= d - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Problem 5-C");
        for (int i = 1; i <= d; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Problem 5-D");
        for (int i = 0; i <= d; i++) {
            for (int j = d - i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
