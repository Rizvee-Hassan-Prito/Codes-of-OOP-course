/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2problem14;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Problem14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        if(a!=b)
        {System.out.println(a+"!="+ b); 
        }
        if(a<b)
        {System.out.println(a+"<"+ b); 
        }
        if(a<=b)
        {System.out.println(a+"<="+ b); 
        }
    }
    
}
