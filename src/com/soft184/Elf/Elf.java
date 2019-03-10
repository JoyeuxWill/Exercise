package com.soft184.Elf;

/**
 * @author SacredBier
 * 妖精
 * 2019/3/10
 */

interface Move {
    public String move();
}

interface Sing {
    public String sing();
}

public class Elf implements Move, Sing {
    @Override
    public String sing() {
        return "唱着歌";
    }

    @Override
    public String move() {
        return "翩翩起舞";
    }

    public static void main(String[] args) {
        Elf elf = new Elf();
        System.out.println("精灵们一边" + elf.sing() + "，一边" + elf.move());
    }
}