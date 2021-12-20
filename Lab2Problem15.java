/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2problem15;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Problem15 {

    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
        int a=input.nextInt();
        int r,d,sum=0;
        while(a!=0)
        {
        r=a%10;
        sum=sum+r;
        a=a/10;
        }
        System.out.println(sum);
    }
    
}
