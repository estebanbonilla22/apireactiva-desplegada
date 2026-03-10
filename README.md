# API Reactiva Desplegada

API Reactiva con Spring Boot + WebFlux + Docker + Vercel.

## Endpoints

- `GET /api/hello`
- `GET /api/status`
- `GET /api/numbers` (SSE)
- `POST /api/echo`

## Ejecución local

```bash
docker-compose up --build
```

Abrir:
- `http://localhost:8081`
- `http://localhost:8081/api/status`

## Vercel

1. Repositorio en GitHub conectado a Vercel.
2. `vercel.json` ya configurado con `@vercel/docker`.
3. Desplegar y verificar `/` y `/api/status`.
