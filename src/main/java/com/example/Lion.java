package com.example;

/**
 * 実装クラス: Lion
 * - Animal を継承
 * - 抽象メソッド makeSound() を実装
 */
public class Lion extends Animal {

    // コンストラクタ: 親クラスのコンストラクタを呼び出す
    public Lion(String name) {
        super(name);
    }

    // ライオンの鳴き声を出力する
    @Override
    public void makeSound() {
        System.out.println(getName() + " はガオーと吠えます！");
    }
}
