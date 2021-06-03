package com.ss.jb.two;

public class Triangle implements Shape{
    private Double base;
    private Double height;

    //getters and setters for class variables

    public Double getHeight() {
        return height;
    }

    public Double getBase() {
        return base;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    /**
     * Constructor takes dimensions of Triangle
     * @param height of triangle
     * @param base of triangle
     */
    public Triangle (Double height, Double base){
        this.height = height;
        this.base = base;
    }

    /**
     * Calculates area of triangle
     * @return calculated area
     */
    @Override
    public Double calculateArea() {
        return (0.5) * height * base;
    }

    /**
     * displays the result of calculated area and dimensions
     */
    @Override
    public void display() {
        System.out.println("Triangle Height: " + this.height);
        System.out.println("Triangle Base: " + this.base);
        System.out.println("Triangle Area: " + this.calculateArea());
        System.out.println();
    }
}
