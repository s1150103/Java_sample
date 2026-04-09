package com.example;

/**
 * 実装クラス: Lion
 * - Animal を継承
 * - 抽象メソッド makeSound() を実装
 */
public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " はガオーと吠えます！");
    }
}
