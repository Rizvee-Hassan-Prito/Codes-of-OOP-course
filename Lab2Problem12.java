/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2problem12;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float w = input.nextFloat();
        float h = input.nextFloat();
        float a = w*h;
        float p = 2*(w+h);
        System.out.println("Area is "+w+"*"+h+"="+a);
        System.out.println("Perimeter is 2*("+w+"+"+h+")="+p);
    } 
}
