package com.entitis;

public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double width) {
        setSide(width);
    }

    public void setLength(double length) {
        setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }
}
