/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem19;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Problem19 {

    public static float fact(int x) {
        float fact = 1;
        for (int d = 1; d <= x; d++) {
            fact = fact * d;
        }
        return fact;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        float sum = 0;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            int mul = 1;
            for (int j = 1; j <= c; j++) {
                mul = mul * x;
            }
            if (i % 2 == 0) {
                sum = sum - (mul / fact(c));
            } else {
                sum = sum + (mul / fact(c));
            }
            c = c + 2;
        }
        System.out.println(sum);
    }

}
