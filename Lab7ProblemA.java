/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8problema;

/**
 *
 * @author User
 */
public class Lab8ProblemA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Press (1) for calculating Rectangle Area\n"
                + "Press (2) for calculating Square Area\n"
                + "Press (3) for calculating Circle Area");
        java.util.Scanner input=new java.util.Scanner(System.in);
        int l=input.nextInt();
        java.util.ArrayList<Shape> a=new java.util.ArrayList<Shape>();
        a.add(new Area());
        a.add(new Area());
        a.add(new Area());
        if(l==1){
            System.out.println(a.get(0).RectangleArea(10, 20));
            System.out.println(a.get(1).RectangleArea(20, 30)); 
            System.out.println(a.get(2).RectangleArea(30, 40));
        }
        else if(l==2){
            System.out.println(a.get(0).SquareArea(10));
            System.out.println(a.get(1).SquareArea(20));
            System.out.println(a.get(1).SquareArea(30));
        }
        else{
         System.out.println(a.get(0).CircleArea(10));
         System.out.println(a.get(1).CircleArea(20));
         System.out.println(a.get(1).CircleArea(30));
    }
    }

}

abstract class Shape {

    public double area;

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public abstract double RectangleArea(double length, double breadth);

    public abstract double SquareArea(double side);

    public abstract double CircleArea(double radius);

}

class Area extends Shape{

   
    public double CircleArea(double radius) {
        return Math.PI*radius*radius;
    }

  
    public double SquareArea(double side) {
     return side*side;
    }

    public double RectangleArea(double length, double breadth) {
       return length*breadth;
    }
    
    

}
