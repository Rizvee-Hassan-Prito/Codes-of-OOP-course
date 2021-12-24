/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem1 {

    /**
     * @param x
     */
    public static void CheckOddEven(int x) {
        if (x % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("odd number");
        }
    
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        CheckOddEven(d);
        System.out.println("bye");

    }
}
