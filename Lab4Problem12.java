/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4problem12;

/**
 *
 * @author User
 */
public class Lab4Problem12 {

   public static void twinPrime()
   {
    int sum = 1, p, i;
        for (i = 1; i > 0; i++) {
            int e = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    e++;
                }
            }
            if (e == 2) {
                p = i;
                if (i - sum == 2) {
                    System.out.println("(" + sum + "," + i + ")");
                }
                sum = i;
            }
            if (i == 100) {
                break;
            }
        }   
   }
    public static void main(String[] args) {
        // TODO code application logic here
        twinPrime();
    }
}
