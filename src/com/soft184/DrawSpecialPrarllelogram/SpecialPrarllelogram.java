package com.soft184.DrawSpecialPrarllelogram;

/**
 * @author Jiayue
 * 定义特殊的平行四边形类
 * 2019/3/10
 */
//
public class SpecialPrarllelogram {
    public static void main(String[] args) {
        DrawImage[] images = {new Rectangle(), new Square(), new Diamond()};
        for (int i = 0; i < images.length; i++) {
            images[i].draw();
        }
    }
}