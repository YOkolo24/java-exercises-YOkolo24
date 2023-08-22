package com.cbfacademy.shapes;

public class Cylinder extends Shape{
    
    double radius;
    double height;
    
    public Cylinder(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double area() {
        double area = (height * (Math.PI * (radius*radius)));
        return area;
    }
}
