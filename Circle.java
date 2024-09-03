package com.variables.variables01.FactoryMethod;

public class Circle implements Shape {
    @Override
    public void area(Long radio, Long height) {
        var pi = 3.14159;
        System.out.println("Area of Circle: " + (radio * radio) * pi);
    }
}
