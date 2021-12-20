/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class File3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file1 = new File("F:\\f1.txt");
        File file2 = new File("F:\\f2.txt");
        Scanner input = new Scanner(file1);
        PrintWriter output = new PrintWriter(file2);
        while (input.hasNext()) {
            String s = input.nextLine();
            int c = 0;
            String[] f = s.split(",");
            for (int j = 0; j < f.length; j++) {
                String[] f1 = f[j].split("");
                String[] f2 = f[j].split("");
                int k = 0;
                for (int i = 0; i < f[j].length(); i++) {
                    if (f1[i].equals(f2[f[j].length() - i - 1])) {
                        k = 0;
                    } else {
                        k = 1;
                        break;
                    }
                }
                if (k == 0) {
                    c++;
                }
            }
            output.println(c + " palindromes.");
        }
        output.close();
    }
}
