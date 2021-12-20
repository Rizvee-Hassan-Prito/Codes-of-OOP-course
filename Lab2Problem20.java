/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2problem20;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Problem20 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        if(a>25 && a<75){
            if(b>25 && b<75)
            {int c,d,e=0,f;
                while(a!=0)
                {
                    f=b;
                    c=a%10;
                    while(f!=0)
                    {
                       d=f%10;
                       if(d==c){e=1;}
                       f=f/10;
                    }
                    a=a/10;
                }
                if(e==1){System.out.println(true);}
                else{System.out.println(false);}
            }
        }
    }
}  

