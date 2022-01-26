/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6questions6;

/**
 *
 * @author User
 */
public class Lab6Questions6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square square=new Square();
        square.printA();
        square.printB();
    }  
}
class Shape{
    void printA(){
        System.out.println("This is This is shape.");
    }
}
class Rectangle extends Shape{
    void printB(){
        System.out.println("This is a Rectangular shape.");
    }
}
class Circle extends Shape{
    void printC(){
        System.out.println("This is a circular shape.");
    }
}
class Square extends Rectangle{
    void printD(){
        System.out.println("Square is a rectangle.");
    }
}