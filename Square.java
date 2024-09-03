package com.variables.variables01.FactoryMethod;

public class Square implements Shape {
    @Override
    public void area(Long base, Long height) {
        System.out.println("Area of Square: " + (base * height));
    }
}
