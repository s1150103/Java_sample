package com.example;

/**
 * メインクラス: 抽象クラスの使用例
 */
public class Main {
    public static void main(String[] args) {
        // 抽象クラスはインスタンス化できない
        // Animal animal = new Animal("抽象"); // コンパイルエラー！

        // サブクラスを使ってインスタンス化
        Animal dog = new Dog("ポチ");
        Animal cat = new Cat("ミケ");
        Animal bird = new Bird("ピヨ");
        Animal lion = new Lion("シンバ");

        // 共通メソッドを使用
        dog.eat();
        cat.eat();
        bird.eat();
        lion.eat();

        // 抽象メソッドを使用（各サブクラスで実装されている）
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        lion.makeSound();

        // ポリモーフィズム: Animal型の変数にサブクラスを代入
        Animal[] animals = {new Dog("ジョン"), new Cat("メアリー"), new Bird("スズメ"), new Lion("レオ")};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}