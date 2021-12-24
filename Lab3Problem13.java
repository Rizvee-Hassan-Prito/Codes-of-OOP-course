/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem13;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem13 {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int x) {
        int fact = 1;
        for (int d = 1; d <= x; d++) {
            fact = fact * d;
        }
        return fact;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int i = 0;
        while (i < d) {
            int j = 0;
            while (j <= i) {
                int sum = (factorial(i) / (factorial(j) * factorial(i - j)));
                System.out.print(" " + sum + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }

}
