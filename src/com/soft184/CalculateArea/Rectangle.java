package com.soft184.CalculateArea;

/**
 * @author Jiayue
 * Rectangle类
 * 2019/3/10
 */

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}