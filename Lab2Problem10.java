/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2problem10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double p = 2*3.1416*r;
        double a = 3.1416*(r*r);
        System.out.println("Perimetere is ="+p);
        System.out.println("Area is ="+a);
    }
}
