# muscle-backend-app

Spring Boot + MySQL を使用した筋トレ記録管理のバックエンドアプリケーションです。

- ユーザー情報の登録・取得
- Docker を使った MySQL 環境構築
- REST API によるデータ操作

---

## 🚀 起動方法

### ① MySQL を Docker で起動

```
docker compose up -d
```

### ② アプリをビルドして起動

```
./mvnw clean package
./mvnw spring-boot:run
```

または jar ファイルから起動：

```
java -jar target/muscle-backend-app-0.0.1-SNAPSHOT.jar
```

---

## ⚙️ 使用技術

- Java 21
- Spring Boot 3.4.5
- Spring Data JPA
- MySQL 8.4
- Maven
- Docker（MySQL コンテナ用）

---

## 📦 API エンドポイント

| メソッド | エンドポイント  | 内容       |
|------|----------|----------|
| GET  | `/users` | ユーザー一覧取得 |
| POST | `/users` | ユーザー作成   |

---

## 🛠 設定ファイル（application.properties）

```
spring.datasource.url=jdbc:mysql://localhost:3306/muscle
spring.datasource.username=user
spring.datasource.password=userpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

📌 `docker-compose.yml` とパラメータが一致していることを確認してください。

---

## 📝 補足

- MySQL は `docker-compose.yml` により構築・永続化されます。
- テーブル作成などは Spring JPA の自動生成に任せています。
- `GET /` にアクセスするとアプリの正常起動が確認できます。


---

## 📘 ライセンス

このプロジェクトは個人学習目的で作成されています。
