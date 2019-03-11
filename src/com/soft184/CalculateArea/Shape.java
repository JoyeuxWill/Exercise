package com.soft184.CalculateArea;

/**
 * @author Jiayue
 * Shape类
 * 2019/3/10
 */

public abstract class Shape {
    String name;

    public String getName() {
        return name;
    }

    public void setsetName(String name) {
        this.name = name;
    }

    public abstract double getArea();
}