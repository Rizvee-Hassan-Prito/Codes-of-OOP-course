/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2problem6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = 125/24;
       System.out.println(a+"+"+b+"="+c);
       System.out.println(a+"-"+b+"="+d);
       System.out.println(a+"*"+b+"="+e);
       System.out.println(a+"/"+b+"="+f);
    }
}
