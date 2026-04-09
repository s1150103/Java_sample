package com.example;

/**
 * 実装クラス: Cat
 * - Animal を継承
 * - 抽象メソッド makeSound() を実装
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " はニャーと鳴きます！");
    }
}