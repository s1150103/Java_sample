package com.example;

/**
 * REST APIのリクエスト用クラス
 * POST /animals で新しい動物を登録する際に使用する
 */
public class AnimalRequest {

    /** 動物の名前（例: ポチ） */
    private String name;

    /** 動物の種類（例: Dog） */
    private String type;

    /** 動物の鳴き声（例: ワンワン） */
    private String sound;

    // JSONのデシリアライズに必要なデフォルトコンストラクタ
    public AnimalRequest() {}

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
