/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Problem 8");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        if (d % 10 == 0) {
            d = d / 10;
        }
        int c = d;
        int g = d;
        int a = 0;
        while (d != 0) {
            int temp = d % 10;
            a++;
            d = d / 10;
        }
        int sum = 0;
        while (a != 0) {
            int x = 1;
            for (int k = 1; k <a; k++) {
                x = x * 10;
            }
            int l = c % 10;
            sum = sum + l * x;
            c = c / 10;
            a--;
        }
        if (g == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
