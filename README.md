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

## Gitコマンド一覧

### 初期設定

```bash
# リポジトリを初期化する
git init

# リモートリポジトリを登録する
git remote add origin https://github.com/ユーザー名/リポジトリ名.git

# ブランチ名をmainに変更する
git branch -M main
```

### 基本操作

```bash
# 状態を確認する
git status

# 変更をステージングする
git add ファイル名
git add .          # 全ファイルをステージング

# コミットする
git commit -m "コミットメッセージ"

# リモートにpushする
git push -u origin ブランチ名

# リモートからpullする
git pull origin main
```

### ブランチ操作

```bash
# ブランチを作成して切り替える
git checkout -b feature/ブランチ名

# ブランチを切り替える
git checkout main

# ブランチ一覧を確認する
git branch
```

### 履歴確認

```bash
# コミット履歴を確認する
git log --oneline
```

---

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
