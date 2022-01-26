/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab4Problem5 {

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
        
            sum=arr[0][0]*(arr[1][1]*arr[2][2]-arr[1][2]*arr[2][1])-arr[0][1]*(arr[1][0]*arr[2][2]-arr[1][2]*arr[2][1])-arr[0][2]*(arr[1][0]*arr[2][1]-arr[1][1]*arr[2][2]);
        System.out.println(sum);
    }
    
}
