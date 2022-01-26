/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem9;

/**
 *
 * @author User
 */
public class Lab4Problem9 {
 public static int series(){
     int sum=0;
     for(int i=1;i<=5;i++){
         sum=sum+fact(i)/i;
     }
     return sum;
 }
 public static int fact(int x)
 {
     int fact=1;
     for(int i=1;i<=x;i++)
     {
         fact=fact*i;
     }
     return fact;
 }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(series());
    }
    
}
