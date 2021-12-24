/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproblem12;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LabProblem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int b = input.nextInt();
        int min = 0;
        int max = 0;
        int c = 0;
        if (d > b) {
            max = d;
            min = b;
        } else {
            min = d;
            max = b;
        }
        for (int i = 1; i <= min; i++) {
            if (d % i == 0 && b % i == 0) {
                c = i;
            }
        }
        System.out.println("GCD:" + c);

    }

}
