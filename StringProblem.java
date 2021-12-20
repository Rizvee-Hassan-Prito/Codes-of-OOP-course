/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringproblem;

import java.util.Arrays;
import java.util.Scanner;

public class StringProblem {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str.length());
        String d = "* *";
        String[] str1;
        str1 = str.split(" ");
        String[] str2;
        str2 = str.split(" ");
        String[] str3;
        str3 = d.split(" ");
        int n = str1.length, k = 0, f = 0;
        for (int i = 0; i < n; i++) {
            if (str1[i].equals(str3[0])) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (str1[i].equals(str1[j])) {
                    str1[j] = "*";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (str1[i].equals(str3[0])) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (str2[j].equals(str3[0])) {
                    continue;
                }
                if (str1[i].equals(str2[j])) {
                    str2[j] = "*";
                }
            }
            k++;
        }
        str2 = str.split(" ");
        String[] str4 = new String[k];
        int[] arr = new int[k];
        for (int i = 0; i < n; i++) {
            int c = 0;
            if (str1[i].equals(str3[0])) {
                continue;
            }
            str4[f] = str1[i];
            for (int j = 0; j < n; j++) {
                if (str2[j].equals(str3[0])) {
                    continue;
                }
                if (str1[i].equals(str2[j])) {
                    c++;
                }
            }
            arr[f] = c;
            f++;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    String temp1 = str4[j + 1];
                    arr[j + 1] = arr[j];
                    str4[j + 1] = str4[j];
                    arr[j] = temp;
                    str4[j] = temp1;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(str4[i] + " has been found " + arr[i] + " times");
        }
    }
}
