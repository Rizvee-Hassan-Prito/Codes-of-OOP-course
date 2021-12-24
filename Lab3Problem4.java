/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Problem 4-A");
        int i;
        int c = 1;
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        for (i = 1; i <= d; i++) {
            int j = 1;
            while (j <= c) {
                {
                    System.out.print("#");
                }
                j++;
            }
            c = c + 2;
            System.out.println();
        }
        System.out.println("Problem 4-B");
        c = d * 2 - 1;
        for (i = 1; i <= d; i++) {
            int j = 1;
            while (j <= c) {
                {
                    System.out.print("#");
                }
                j++;
            }
            c = c - 2;
            System.out.println();
        }
    }

}
