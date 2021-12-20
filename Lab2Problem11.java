/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2problem11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Problem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);   
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        float n = (a+b+c)/3;
        System.out.println(n);
    }
    
}
