/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        float sum = 0;
        float i;
        for (i = (float) 1.0; i <= d; i++) {
            sum = sum + (1 / i);
        }
        System.out.println(sum);
    }

}
