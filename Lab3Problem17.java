/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem17;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        if (d == 1) {
            System.out.println("Monday");
        } else if (d == 2) {
            System.out.println("Tuesday");
        } else if (d == 3) {
            System.out.println("W5ednesday");
        } else if (d == 4) {
            System.out.println("Thursday");
        } else if (d == 5) {
            System.out.println("Friday");
        } else if (d == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }

}
