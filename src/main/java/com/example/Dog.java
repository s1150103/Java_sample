package com.example;

/**
 * 実装クラス: Dog
 * - Animal を継承
 * - 抽象メソッド makeSound() を実装
 */
public class Dog extends Animal {

    // コンストラクタ: 親クラスのコンストラクタを呼び出す
    public Dog(String name) {
        super(name);
    }

    // 犬の鳴き声を出力する
    @Override
    public void makeSound() {
        System.out.println(getName() + " はワンワン吠えます！");
    }
}
