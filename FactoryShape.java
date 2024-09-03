package com.variables.variables01.FactoryMethod;

public class FactoryShape {
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
