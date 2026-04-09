package com.example;

/**
 * REST APIのレスポンス用クラス
 * 動物の情報をJSON形式で返すために使用する
 */
public class AnimalResponse {

    /** 動物の名前（例: ポチ） */
    private String name;

    /** 動物の種類（例: Dog） */
    private String type;

    /** 動物の鳴き声（例: ワンワン） */
    private String sound;

    /**
     * コンストラクタ
     *
     * @param name  動物の名前
     * @param type  動物の種類
     * @param sound 動物の鳴き声
     */
    public AnimalResponse(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    /**
     * 動物の名前を返す
     *
     * @return 動物の名前
     */
    public String getName() { return name; }

    /**
     * 動物の種類を返す
     *
     * @return 動物の種類
     */
    public String getType() { return type; }

    /**
     * 動物の鳴き声を返す
     *
     * @return 動物の鳴き声
     */
    public String getSound() { return sound; }
}
