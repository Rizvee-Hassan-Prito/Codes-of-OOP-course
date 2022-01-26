/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem7;

/**
 *
 * @author User
 */
public class Lab4Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       java.util.Scanner input=new java.util.Scanner(System.in);
       String str=input.nextLine();
       String[] str1=str.split(" ");
       String s=" ",s2=" ";
        System.out.println(str1);
       int c=0,c1=str1[0].length();
       for(int i=0;i<str1.length;i++){
           if(c<str1[i].length()){
               c=str1[i].length();
               s=str1[i];
           }
           if(c1>str1[i].length()){
              c1=str1[i].length();
               s2=str1[i]; 
           }
       }
        System.out.println("The largest word is '" + s +"' and the smallest word is '" +s2+"'.");
    }
    
}
