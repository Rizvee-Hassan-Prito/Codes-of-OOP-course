/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem14;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem14 {

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
        System.out.println(factorial(d));
    }

}
