/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2problem19;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Problem19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int e=0,f=0,g=0;
        if(a==20 ||a>20 && a<b-c||a<c-b)
        {
            e=1;
        }
        if(b==20 ||b>20 && b<a-c || b<c-a){
            f=1;
        }
        if(c==20 ||c>20 && c<a-b || c<b-a){
            g=1;
        }
        if(e==1 || f==1 || g==1 )
        {System.out.println(true);
    
}
        else{
            System.out.println(false);
        }
}
}
