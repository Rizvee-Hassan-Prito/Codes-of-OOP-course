/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class File1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File file = new File("F:\\PPP.txt");
        
        PrintWriter output = new PrintWriter(file);
        output.println("Assamulaikum.");
        output.println("I am from Bangladesh.Hello.");
        output.println("I have been here for two days.");
        output.close();
        
        File file2 = new File("F:\\PPP2.txt");
        PrintWriter output2 = new PrintWriter(file2);
        
        Scanner input = new Scanner(file);
        String a="";
        while (input.hasNext()) {
            //a+=input.nextLine()+"\n";
            a =input.nextLine()+"\n";
            output2.println(a);
        }
        output2.println("Extended.");
        input.close();
        output2.close();
        
        System.out.println(a);
        String[] b=a.split(" ");
        System.out.println(b.length);
        System.out.println(file.length());
        
       /* URL url = new URL("https://www.javatpoint.com/java-file-class");
        Scanner ipt = new Scanner(url.openStream());
        int count = 0;
        String a1 = "";
        while (ipt.hasNext()) {
            a1 += ipt.nextLine() + "\n";
            count += a1.length();
        }
        System.out.println(a1 + "\n" + count);*/
    }

}
