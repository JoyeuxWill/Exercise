package com.soft184.ByThingsInMarket;
/**
 * @author Jiayue
 * 买东西的抽象方法
 * 2019/3/10
 */

public abstract class Market {
    //商场名称
    public String name;
    //商品名称
    public String goods;
    //抽象方法 用来输出信息
    public abstract void shop();
}
