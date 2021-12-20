/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass2;

/**
 *
 * @author User
 */
class TestGeneric<T,U>{
    T obj;
    U obj2;
    TestGeneric(T obj,U obj2){
        this.obj=obj;
        this.obj2=obj2;
    }
    void print(){
        System.out.println(obj);
        System.out.println(obj2);
    }
}

public class GenericClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestGeneric<Integer,String> m=new TestGeneric<Integer,String>(2,"hello");
        m.print();
        TestGeneric<String,Double> m2=new TestGeneric<String,Double>("hi",4.8);
        m2.print();
        
    }
    
}
