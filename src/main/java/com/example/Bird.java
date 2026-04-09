package com.example;

/**
 * 実装クラス: Bird
 * - Animal を継承
 * - 抽象メソッド makeSound() を実装
 */
public class Bird extends Animal {

    // コンストラクタ: 親クラスのコンストラクタを呼び出す
    public Bird(String name) {
        super(name);
    }

    // 鳥の鳴き声を出力する
    @Override
    public void makeSound() {
        System.out.println(getName() + " はチュンチュンと鳴きます！");
    }
}
