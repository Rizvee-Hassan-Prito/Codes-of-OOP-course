/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem13;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab4Problem13 {

    public static int recursion(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else{
            return n*recursion (n-1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(recursion(n));
    }
    
}
