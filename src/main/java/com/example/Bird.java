package com.example;

/**
 * 実装クラス: Bird
 * - Animal を継承
 * - 抽象メソッド makeSound() を実装
 */
public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " はチュンチュンと鳴きます！");
    }
}
