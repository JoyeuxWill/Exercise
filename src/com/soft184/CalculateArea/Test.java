package com.soft184.CalculateArea;

/**
 * @author SacredBier
 * 测试类
 * 2019/3/10
 */

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.name = "圆形";
        System.out.println(circle.name + "面积：" + circle.getArea());
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.name = "矩形";
        System.out.println(rectangle.name + "面积：" + rectangle.getArea());
    }
}