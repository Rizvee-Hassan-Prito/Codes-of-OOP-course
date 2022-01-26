/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem14;

/**
 *
 * @author User
 */
public class Lab4Problem14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         java.util.Scanner input = new java.util.Scanner(System.in);
         String s1=input.nextLine();
         String s2=input.nextLine();
         if(s1.length()!=s2.length()){
             System.out.println(s1+" and "+s2+" are not Anagram.");
         }
        String[] str1 = s1.split("");
        String[] str2 = s2.split("");
        for (int i = 0; i < str1.length; i++) {
            int e = 0;
            for (int j = 0; j < str1.length; j++) {
                if (str1[i].equalsIgnoreCase(str2[j])) {
                    e = 1;
                }
            }
            if (e == 0) {
                System.out.println(s1+" and "+s2+" are not Anagram.");
                return;
            }
        }
        System.out.println(s1+" and "+s2+" are Anagram.");
    }
    
}
