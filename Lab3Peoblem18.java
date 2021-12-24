/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3peoblem18;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Peoblem18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        if (d % 400 == 0 || (d % 100 != 0 && d % 4 == 0)) {

            System.out.println("leap year");

        } else {
            System.out.println("not leap year");
        }
    }

}
