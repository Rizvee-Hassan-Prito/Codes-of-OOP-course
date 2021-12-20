/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowerboundwildcard;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class LowerBoundWildCard {

    /**
     * @param args the command line arguments
     */
    public static void print(ArrayList<? super Integer>list){
        for(Object n:list){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> i=new ArrayList <Integer>();
        i.add(10);
        i.add(20);
        ArrayList <Number> n=new ArrayList <Number>();
        n.add(10.5);
        n.add(20.2);
        
        print(i);
        print(n);
    }
    
}
