/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squarepattern;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SquarePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int j;
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        for (i = 0; i < d; i++) {
            for (j = 0; j < d; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
