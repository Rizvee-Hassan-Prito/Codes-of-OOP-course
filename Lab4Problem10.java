/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab4Problem10 {

    public static int mul(int x, int n) {
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum = sum * x;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = n,z = n,a = 0,sum = 0,k;
        while (x != 0) {
            x = x / 10;
            a++;
        }
        while (z != 0) {
            k = z % 10;
            sum = sum + mul(k, a);
            z = z / 10;
        }
        if (sum == n) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not Armstrong number.");
        }
        int sum2 = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum2 = sum2 + i;
            }
        }
        if (sum2 == n) {
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not perfect number.");
        }
    }

}
