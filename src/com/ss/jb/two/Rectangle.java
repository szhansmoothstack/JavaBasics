package com.ss.jb.two;

public class Rectangle implements Shape{
    private Double width;
    private Double height;

    //Getters and setters for class fields
    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    /**
     * Constructor takes dimension of rectangle
     * @param height of rectangle
     * @param width of rectangle
     */
    public Rectangle (Double height, Double width){
        this.height = height;
        this.width = width;
    }

    /**
     * Calculates area
     * @return area
     */
    @Override
    public Double calculateArea() {
        return height * width;
    }

    /**
     * Prints the calculated area and dimensions
     */
    @Override
    public void display() {
        System.out.println("Rectangle Height: " + this.height);
        System.out.println("Rectangle width: " + this.width);
        System.out.println("Rectangle Area: " + this.calculateArea());
        System.out.println();
    }
}
