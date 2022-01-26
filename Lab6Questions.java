/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6questions;

/**
 *
 * @author User
 */
public class Lab6Questions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a=new A();
        a.printA();
        B b=new B();
        b.printB();
        B a1=new B();
        a1.printA();
    }

}

class A{

    void printA() {
        System.out.println("This is parent class");
    }
}
class B extends A{
     void printB() {
        System.out.println("This is child class");
    }
}