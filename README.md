# SimpleJavaExample

Javaの抽象クラスと継承を学ぶサンプルプロジェクトです。

## プロジェクト構成

```
src/main/java/com/example/
├── Animal.java  # 抽象クラス（親）
├── Dog.java     # 具象クラス（子）
├── Cat.java     # 具象クラス（子）
├── Bird.java    # 具象クラス（子）
├── Lion.java    # 具象クラス（子）
└── Main.java    # 実行クラス
```

## クラス構造

```
Animal（抽象クラス・親）
├── Dog（具象クラス・子）
├── Cat（具象クラス・子）
├── Bird（具象クラス・子）
└── Lion（具象クラス・子）
```

- `Animal` は抽象クラスのため直接インスタンス化できない
- `makeSound()` は抽象メソッドで、各子クラスが実装する
- `eat()` は共通メソッドで、全子クラスで共通利用できる

## 開発の流れ（チーム開発）

### 1. ブランチを作成する

```bash
git checkout -b feature/ブランチ名
```

### 2. コードを修正・追加する

例：新しい動物クラスを追加する場合
- `src/main/java/com/example/` に新しいクラスファイルを作成
- `Main.java` にインスタンス化・メソッド呼び出しを追加

### 3. コミットする

```bash
git add ファイル名
git commit -m "コミットメッセージ"
```

### 4. リモートにpushする

```bash
git push -u origin feature/ブランチ名
```

### 5. Pull Requestを作成する

```bash
gh pr create --title "タイトル" --body "説明"
```

またはGitHubのWebブラウザから作成する。

### 6. レビューを受けてマージする

```bash
gh pr merge PR番号 --merge
```

### 7. ローカルを最新化する

```bash
git checkout main
git pull origin main
```

## 実行方法

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.Main"
```
