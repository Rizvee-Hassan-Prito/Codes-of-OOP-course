/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;

class TestGenerics<T>{
    T obj;
    TestGenerics(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}

public class GenericClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestGenerics<Integer> m=new TestGenerics<Integer>(2);
        System.out.println(m.get());
        
        TestGenerics<String> s=new TestGenerics<String>("Hello");
        System.out.println(s.get());
    }
    
}
