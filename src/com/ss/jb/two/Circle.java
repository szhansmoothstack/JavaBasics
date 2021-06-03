package com.ss.jb.two;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class Circle implements Shape{
    private Double radius;

    //gettes and setters for class fields
    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    /**
     * Constructor takes radius of circle
     * @param radius of circle
     */
    public Circle (Double radius){
        this.radius = radius;
    }

    /**
     * Calculates area of circle
     * @return calculated area
     */
    @Override
    public Double calculateArea() {
        return (PI * pow(radius, 2));
    }

    /**
     * Prints the calculated area and dimension
     */
    @Override
    public void display() {
        System.out.println("Circle Radius: " + this.radius);
        System.out.println("Circle Area: " + this.calculateArea());
        System.out.println();
    }
}
