/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upperboundwildcard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
abstract class shape{
    abstract void shape();
}
class Rectangle extends shape{
    void shape() {
        System.out.println("Rectangle.");
    }
    
}

class Circle extends shape{
    void shape() {
        System.out.println("Circle.");
    }
    
}

public class UpperBoundWildCard {

    /**
     * @param args the command line arguments
     */
    
    public static void makeShape(List<?extends shape>list){
        for(shape s:list){
            s.shape();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        List<Circle> c=new ArrayList<Circle>();
        c.add(new Circle());
        c.add(new Circle());
        List<Rectangle> r=new ArrayList<Rectangle>();
        r.add(new Rectangle());
        makeShape(r);
        makeShape(c);
        
    }
    
}
