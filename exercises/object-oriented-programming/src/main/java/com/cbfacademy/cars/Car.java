package com.cbfacademy.cars;

public class Car {
 //variable   
    private String make;
    private String model;
    private int year;

 //constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
 //getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    
}    
