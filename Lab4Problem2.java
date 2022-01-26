/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab4Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 9999, max2nd = 9999;
        int i;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] < max2nd && arr[i] != max) {
                max2nd = arr[i];
            }
        }
        System.out.println(max2nd);
    }
}
