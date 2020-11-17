package com.entitis;

public class Main {

    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", false, x);
        shapes[1] = new Rectangle("red", true, x, x);
        shapes[2] = new Square("green", false, x);

        for (Shape s : shapes) {
            System.out.println(s);
        }

        for (Shape s : shapes) {
            s.resize(Math.random() * 1000);
        }
        System.out.println();
        Shape.printShape(shapes);
    }
}
