package com.soft184.ByThingsInMarket;

/**
 * @author Jiayue
 * 为实体类赋值
 * 2019/3/10
 */
public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods = "七匹狼服饰";
        market.shop();
        market = new TaobaoMarket();
        market.name = "淘宝";
        market.goods = "韩都衣舍花裙";
        market.shop();
    }
}