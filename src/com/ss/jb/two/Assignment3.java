package com.ss.jb.two;

public class Assignment3 {
    public static void main (String[] args){
        Circle circle = new Circle(4.5);
        Triangle triangle = new Triangle(5.0, 6.6);
        Rectangle rectangle = new Rectangle(3.5, 2.3);

        //Display method will be using calculate areas
        circle.display();
        triangle.display();
        rectangle.display();
    }
}
