package com.company;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int squareRectangle() {
        int square = length * width;
        return square;
    }

    public int perimeterRectangle() {
        int perimeter = (length + width) * 2;
        return perimeter;
    }
}
