/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6questions5;

/**
 *
 * @author User
 */
public class Lab6Questions5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square[] r = new Square[10];
        int a = 1;
        for (int i = 0; i < 10; i++) {
            r[i] = new Square(a);
            a++;
            r[i].area();
            r[i].perimeter();
        }

    }

}

class Rectangle {

    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println(length * breadth);
    }

    void perimeter() {
        System.out.println(2 * (length + breadth));
    }
}

class Square extends Rectangle {

    Square(int s) {
        super(s, s);
    }

    void area() {
        System.out.println("Area: "+length * length);
    }

    void perimeter() {
        System.out.println("Perimeter: "+4 * length);
    }
}
