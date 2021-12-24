/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3problem10;

/**
 *
 * @author User
 */
public class Lab3Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Problem 10-A");
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= i * 2 - 1) {
                System.out.print(i);
                j = j + 1;
            }
            System.out.println();
            i++;
        }
        System.out.println("Problem 10-B");
        i = 1;
        while (i <= 5) {
            int j = i;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            int k = 2;
            while (k <= i) {
                System.out.print(k);
                k++;
            }
            System.out.println();
            i++;
        }
    }

}
