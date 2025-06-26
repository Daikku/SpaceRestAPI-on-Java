# Space Rest API service

## Запуск сервиса
Команда для запуска сервиса с помощью Docker Compose:
```bash
docker-compose up --build
```

## Переменные окружения

Для запуска сервиса необходимо создать файл `.env` и указать в нем следующие значения (продублированы в `.env.example`):

```plaintext
NASA_API_KEY=your_api_key                   # Ваш API_KEY от API NASA (приходит на почту после регистрации)

POSTGRES_DB=db_name                         # Навзание БД в Postgres
POSTGRES_USER=user                          # Имя пользователя в Postgres
POSTGRES_PASSWORD=password                  # Пароль в Postgres
```

