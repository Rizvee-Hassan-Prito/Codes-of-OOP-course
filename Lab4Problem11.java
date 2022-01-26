/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem11;

import java.lang.*;

/**
 *
 * @author User
 */
public class Lab4Problem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.\n"
                + "2. A password consists of only letters and digits.\n"
                + "3. A password must contain at least two digits" + "\nInput a password (You are agreeing to the above Terms and Conditions.):");
        String s = input.nextLine(), str = "ABCDEFGHIZKLMNOPQRSTUVWXYZabcdefghizklmnopqrstuvwxyz123456789", str1 = "123456789";
        String[] s1 = s.split("");
        String[] s2 = str.split("");
        String[] s3 = str1.split("");
        int c = 0, e = 0;
        if (s.length() < 8) {
            System.out.println("Password is not valid.");
            return;
        }
        for (int i = 0; i < s1.length; i++) {
            e = 0;
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    e = 1;
                }
            }
            if (e == 0) {
                System.out.println("Password is not valid.");
                return;
            }
            for (int j = 0; j < s3.length; j++) {
                if (s1[i].equals(s3[j])) {
                    c++;
                }
            }
        }
        if (c < 2 && c == 0) {
            System.out.println("Password is not valid.");
            return;
        }
        System.out.println("Password is valid.");

    }

}
