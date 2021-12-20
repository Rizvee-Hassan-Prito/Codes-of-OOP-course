/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethod;

/**
 *
 * @author User
 */

public class GenericMethod {
    
      public static <E> void printArray(E[] elements){
        for(E element:elements){
            System.out.print(element+"\n");           
        }
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] intArray ={1,2,3,4,5,6,7};
        String[] strArray={"A","B","C"};
        printArray(intArray);
        printArray(strArray);
                
    }
    
}
