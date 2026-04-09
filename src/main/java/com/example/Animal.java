package com.example;

/**
 * 抽象クラス: Animal
 * - 共通のフィールド（name）とメソッドを持つ
 * - 抽象メソッド makeSound() を定義（サブクラスで実装必須）
 */
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // nameを取得する
    public String getName() {
        return name;
    }

    // 共通メソッド: 全動物で同じ
    public void eat() {
        System.out.println(name + " は食べています。");
    }

    // 抽象メソッド: 各動物で音が違うので、サブクラスで実装
    public abstract void makeSound();
}