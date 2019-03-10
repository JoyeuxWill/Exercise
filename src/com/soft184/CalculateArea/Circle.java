package com.soft184.CalculateArea;

/**
 * @author Jiayue
 * 定义圆形类
 * 2019/3/10
 */

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
}