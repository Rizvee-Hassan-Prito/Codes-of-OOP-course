/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2problem17;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Problem17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        int a=input.nextInt();
        int c=a%2;
        if(c==0)
        {System.out.println(1);
    }
        else{System.out.println(0);}
    
}
}
