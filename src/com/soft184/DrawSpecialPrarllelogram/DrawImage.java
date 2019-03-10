package com.soft184.DrawSpecialPrarllelogram;

/**
 * @author Jiayue
 * 定义接口
 * 2019/3/10
 */

interface DrawImage {
    //定义抽象方法“画”
    public void draw();
}

//实现draw()的方法
class Rectangle implements DrawImage {
    public void draw() {
        System.out.println("画矩形");
    }
}

class Square implements DrawImage {
    public void draw() {
        System.out.println("画正方形");
    }
}

class Diamond implements DrawImage {
    public void draw() {
        System.out.println("画菱形");
    }
}