/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6questions4;

/**
 *
 * @author User
 */
public class Lab6Questions4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rectangle=new Rectangle(2,3);
        Square square=new Square(2);
        rectangle.area();
        rectangle.perimeter();
        square.area();
        square.perimeter();
    }
    
}
class Rectangle{
    int length, breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void area(){
        System.out.println(length*breadth);
    }
    void perimeter(){
        System.out.println(2*(length+breadth));
    }  
}
class Square extends Rectangle{
    Square(int s){
        super(s,s);
    }
    void area(){
        System.out.println(length*length);
    }
    void perimeter(){
        System.out.println(4*length);
    }  
}