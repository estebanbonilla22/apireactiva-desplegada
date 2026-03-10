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

## Fly.io (recomendado para Docker)

1. Instala flyctl: `curl -L https://fly.io/install.sh | sh` (Windows: https://fly.io/docs/getting-started/installing-flyctl/).
2. Login:

```bash
flyctl auth login
```

3. Despliega:

```bash
flyctl launch --name apireactiva-desplegada --region iad --dockerfile Dockerfile --no-deploy
flyctl deploy
```

4. Verifica:

- `https://apireactiva-desplegada.fly.dev/`
- `https://apireactiva-desplegada.fly.dev/api/status`

## Vercel (no compatible con @vercel/docker)

Vercel no permite ahora la builder `@vercel/docker` para todos los planes. Si tu objetivo es desplegar en Vercel, podrías usar la app de backend en Fly/Railway/Render y tener en Vercel solo frontend. “fly” es la vía rápida y estable para Docker.
