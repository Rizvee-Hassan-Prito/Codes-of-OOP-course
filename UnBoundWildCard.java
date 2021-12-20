/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unboundwildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
public class UnBoundWildCard {

    /**
     * @param args the command line arguments
     */
    public static void display(List<?> list) {

        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println("displaying the Integer values:");
        display(l1);
        List<String> l2 = new ArrayList<String>();
        l2.add("one");
        l2.add("two");
        l2.add("three");
        System.out.println("displaying the String values:");
        display(l2);
    }

}
