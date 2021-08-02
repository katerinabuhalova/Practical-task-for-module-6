package com.company;

public class Rectangle {
    private int length;
    private int width;


    public void squareRectangle(int length, int width) {
        int square = length * width;
        System.out.println(square);
    }

    public void perimeterRectangle(int length, int width) {
        int perimeter = (length + width) * 2;
        System.out.println(perimeter);
    }
}
