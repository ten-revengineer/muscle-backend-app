# muscle-backend-app

Spring Boot + MySQL を使用した筋トレ記録管理のバックエンドアプリケーションです。

- ユーザー情報の登録・取得
- Docker を使った MySQL 環境構築
- REST API によるデータ操作

---

## 🚀 起動方法（Docker 環境のみで完結）

### アプリとMySQLをまとめて起動

```
docker compose up --build -d
```
初回ビルドやコード更新時は --build を付けてください。
停止する場合は：

```
docker compose down
```

---

## ⚙️ 使用技術

- Java 21
- Spring Boot 3.4.5
- Spring Data JPA
- MySQL 8.4
- Maven
- Docker / Docker Compose

---

## 📦 API エンドポイント

| メソッド | エンドポイント  | 内容       |
|------|----------|----------|
| GET  | `/users` | ユーザー一覧取得 |
| POST | `/users` | ユーザー作成   |

---

## 🛠 設定ファイル（src/main/resources/application.properties）

```
spring.datasource.url=jdbc:mysql://mysql:3306/muscle
spring.datasource.username=user
spring.datasource.password=userpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

📌 ホスト名 `mysql` は `docker-compose.yml` のサービス名と一致させています。



---

## 🐳 docker-compose.yml の構成
```
services:
  app:
    build: .
    ports:
      - "8080:8080"
    depends_on:
      - mysql

  mysql:
    image: mysql:8.4
    environment:
      MYSQL_ROOT_PASSWORD: rootpassword
      MYSQL_DATABASE: muscle
      MYSQL_USER: user
      MYSQL_PASSWORD: userpassword
    ports:
      - "3306:3306"
    volumes:
      - mysql_data:/var/lib/mysql

volumes:
  mysql_data:
```
---

## ✅ 動作確認

- アプリ起動後、以下のURLにアクセス：
- http://localhost:8080/ → 起動確認
- http://localhost:8080/users → 登録ユーザー一覧（GET）


---

## 📘 ライセンス

このプロジェクトは個人学習目的で作成されています。
