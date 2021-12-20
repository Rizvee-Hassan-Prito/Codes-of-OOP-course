/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fil.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fil2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file1 = new File("F:\\File1.txt");
        File file2 = new File("F:\\File2.txt");
        Scanner input = new Scanner(file1);
        PrintWriter output = new PrintWriter(file2);
        while (input.hasNext()) {
            String s = input.nextLine();
            String[] f = s.split(",");
            int[] a = new int[f.length];
            for (int i = 0; i < f.length; i++) {
                a[i] = Integer.parseInt(f[i]);
            }
            int b = 0;
            for (int i = 0; i < f.length; i++) {
                int c = 0;
                for (int k = 2; k < a[i]; k++) {
                    if (a[i] % k == 0) {
                        c++;
                    }
                }
                if (c != 0) {
                    b++;
                }
            }
            output.println(b + " composites");
        }
        output.close();
    }

}
