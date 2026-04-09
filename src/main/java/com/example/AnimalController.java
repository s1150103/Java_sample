package com.example;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private final List<AnimalResponse> animals = List.of(
        new AnimalResponse("ポチ", "Dog", "ワンワン"),
        new AnimalResponse("ミケ", "Cat", "ニャー"),
        new AnimalResponse("ピヨ", "Bird", "チュンチュン"),
        new AnimalResponse("シンバ", "Lion", "ガオー")
    );

    // 全動物一覧を返す
    @GetMapping
    public List<AnimalResponse> getAllAnimals() {
        return animals;
    }

    // 種類で絞り込む
    @GetMapping("/{type}")
    public AnimalResponse getAnimalByType(@PathVariable String type) {
        return animals.stream()
            .filter(a -> a.getType().equalsIgnoreCase(type))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Animal not found: " + type));
    }
}
