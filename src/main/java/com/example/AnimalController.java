package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 動物APIのコントローラー
 * /animals エンドポイントのルーティングを担当する
 */
@RestController
@RequestMapping("/animals")
public class AnimalController {

    // 動物一覧（追加できるようにArrayListで管理する）
    private final List<AnimalResponse> animals = new ArrayList<>(List.of(
        new AnimalResponse("ポチ", "Dog", "ワンワン"),
        new AnimalResponse("ミケ", "Cat", "ニャー"),
        new AnimalResponse("ピヨ", "Bird", "チュンチュン"),
        new AnimalResponse("シンバ", "Lion", "ガオー")
    ));

    /**
     * 全動物一覧を返す
     *
     * @return 動物一覧
     */
    @GetMapping
    public List<AnimalResponse> getAllAnimals() {
        return animals;
    }

    /**
     * 種類で動物を絞り込んで返す
     *
     * @param type 動物の種類（例: dog）
     * @return 該当する動物
     */
    @GetMapping("/{type}")
    public AnimalResponse getAnimalByType(@PathVariable String type) {
        return animals.stream()
            .filter(a -> a.getType().equalsIgnoreCase(type))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Animal not found: " + type));
    }

    /**
     * 新しい動物を追加する
     *
     * @param request リクエストボディ（name, type, sound）
     * @return 追加した動物の情報
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AnimalResponse addAnimal(@RequestBody AnimalRequest request) {
        AnimalResponse newAnimal = new AnimalResponse(
            request.getName(),
            request.getType(),
            request.getSound()
        );
        animals.add(newAnimal);
        return newAnimal;
    }
}
