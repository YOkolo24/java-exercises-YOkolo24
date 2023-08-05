package com.cbfacademy.shapes;

public abstract class Shape {

    protected String shapeName;
    
    public abstract double area();

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        System.out.println("This is a " + this.shapeName);
        return this.shapeName;
    }

public static void main(String[] args) {
    
    Rectangle rectangle1 = new Rectangle("rectangle", 3, 5);
    Sphere sphere1 = new Sphere("sphere", 5);
    Cylinder cylinder1 = new Cylinder("cylinder", 3, 7);

    System.out.println(sphere1.area());
}
}
