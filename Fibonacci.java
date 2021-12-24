/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author User
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 1;
        int i = 1;
        int y = 0;
        int sum = 0;
        while (i <= 20) {
            sum = x + y;
            x = y;
            y = sum;
            System.out.println(sum);
            i++;
        }
        System.out.println("the average is " + sum / 20);
    }
}
