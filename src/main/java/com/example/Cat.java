package com.example;

/**
 * 実装クラス: Cat
 * - Animal を継承
 * - 抽象メソッド makeSound() を実装
 */
public class Cat extends Animal {

    // コンストラクタ: 親クラスのコンストラクタを呼び出す
    public Cat(String name) {
        super(name);
    }

    // 猫の鳴き声を出力する
    @Override
    public void makeSound() {
        System.out.println(getName() + " はニャーと鳴きます！");
    }
}
