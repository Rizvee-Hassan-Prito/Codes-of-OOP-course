/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem16;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        for (int i = 1; i <= d; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int z = d - 1; z >= 1; z--) {
            for (int x = z; x >= 1; x--) {
                System.out.print(x);
            }
            for (int k = 2; k <= z; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

}
