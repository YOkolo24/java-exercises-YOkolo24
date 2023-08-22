package com.cbfacademy.shapes;

public class Rectangle extends Shape{

    double length;
    double width;
    
    public Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        double area = (this.length*this.width);
        return area;
    }
    
}
