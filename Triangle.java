package com.variables.variables01.FactoryMethod;

public class Triangle implements Shape {
    @Override
    public void area(Long base, Long height) {
        System.out.println("Area of Triangle: " + (base * height) / 2);
    }
}
