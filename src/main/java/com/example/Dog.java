package com.example;

/**
 * 実装クラス: Dog
 * - Animal を継承
 * - 抽象メソッド makeSound() を実装
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " はワンワン吠えます！");
    }
}