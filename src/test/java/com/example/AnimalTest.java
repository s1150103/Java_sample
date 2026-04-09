package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    // nameが正しく設定されるか
    @Test
    void testDogName() {
        Dog dog = new Dog("ポチ");
        assertEquals("ポチ", dog.getName());
    }

    @Test
    void testCatName() {
        Cat cat = new Cat("ミケ");
        assertEquals("ミケ", cat.getName());
    }

    @Test
    void testBirdName() {
        Bird bird = new Bird("ピヨ");
        assertEquals("ピヨ", bird.getName());
    }

    @Test
    void testLionName() {
        Lion lion = new Lion("シンバ");
        assertEquals("シンバ", lion.getName());
    }

    // Animalを継承しているか
    @Test
    void testDogIsAnimal() {
        Dog dog = new Dog("ポチ");
        assertInstanceOf(Animal.class, dog);
    }

    @Test
    void testCatIsAnimal() {
        Cat cat = new Cat("ミケ");
        assertInstanceOf(Animal.class, cat);
    }

    @Test
    void testBirdIsAnimal() {
        Bird bird = new Bird("ピヨ");
        assertInstanceOf(Animal.class, bird);
    }

    @Test
    void testLionIsAnimal() {
        Lion lion = new Lion("シンバ");
        assertInstanceOf(Animal.class, lion);
    }

    // makeSound()が例外なく実行できるか
    @Test
    void testDogMakeSound() {
        Dog dog = new Dog("ポチ");
        assertDoesNotThrow(() -> dog.makeSound());
    }

    @Test
    void testCatMakeSound() {
        Cat cat = new Cat("ミケ");
        assertDoesNotThrow(() -> cat.makeSound());
    }

    @Test
    void testBirdMakeSound() {
        Bird bird = new Bird("ピヨ");
        assertDoesNotThrow(() -> bird.makeSound());
    }

    @Test
    void testLionMakeSound() {
        Lion lion = new Lion("シンバ");
        assertDoesNotThrow(() -> lion.makeSound());
    }

    // eat()が例外なく実行できるか
    @Test
    void testEat() {
        Animal dog = new Dog("ポチ");
        assertDoesNotThrow(() -> dog.eat());
    }
}
