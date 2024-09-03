package com.variables.variables01.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        FactoryShape factoryShape = new FactoryShape();
        Shape shape1 = factoryShape.getShape("CIRCLE");
        shape1.area(5L, 5L);
        Shape shape2 = factoryShape.getShape("TRIANGLE");
        shape2.area(5L, 5L);
        Shape shape3 = factoryShape.getShape("SQUARE");
        shape3.area(5L, 5L);
    }
}
