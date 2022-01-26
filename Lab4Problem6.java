/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab4Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input the string : ");
        String s = input.nextLine();
        System.out.println("Input the substring to be search : ");
        String z = input.nextLine();
        if (s.contains(z)) {
            System.out.println("The substring is exist in the string.");
            int count = 0;
            int c = 0;
            while ((c = s.indexOf(z, c)) != -1) {
                count++;
                c++;
            }
            System.out.println("string has been found " + count + " times.");
        } else {
            System.out.println("The substring is not exist in the string.");
        }
    }

}
