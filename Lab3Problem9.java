/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem9;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(ar[i]%2==0)
            {
                System.out.println("Even Numbers:"+ar[i]);
            }
            else{
                System.out.println("Odd Numbers:"+ar[i]);
            }
        }
            
    }
    
}
