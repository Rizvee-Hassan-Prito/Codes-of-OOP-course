/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author User
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.ArrayList<Integer> a = new java.util.ArrayList<Integer>();
        int b = 0;
        for (int i = 0; i < 10; i++) {
            a.add(b);
            if (i % 2 == 0) {
                b++;
            } else {
                b = b - 2;
            }
        }
        java.util.Collections.sort(a);
        System.out.println(a);

    }
}
