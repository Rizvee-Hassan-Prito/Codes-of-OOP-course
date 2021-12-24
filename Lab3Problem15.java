/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem15;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int i = 1;
        int t;
        do {
            t = x % 10;
            System.out.print(t);
            x = x / 10;
        } while (x != 0);
        System.out.println();
    }

}
