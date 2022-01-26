/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab4Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum=0;
        int i;
        int arr[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
 for (i = 0; i < n; i++) {
           
                sum=sum+arr[i][i];
           
        }
        System.out.println(sum);
    }

}
