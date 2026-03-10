# API Reactiva Sencilla

Proyecto ejemplo de API reactiva con Spring WebFlux.

## Endpoints

- `GET /api/hello` => Mono<String>
- `GET /api/numbers` => Flux<Integer> como SSE (1 número/s)
- `POST /api/echo` => Mono<String> con body retornado

## Ejecutar

```bash
mvn spring-boot:run
```

## Probar

```bash
curl http://localhost:8080/api/hello
curl http://localhost:8080/api/numbers
curl -X POST -d "hola" http://localhost:8080/api/echo
```

## Docker

Build image y ejecutar con Docker Compose en host puerto 8081 (contenedor 8080):

```bash
docker-compose up --build -d
```

Accede en:

- `http://localhost:8081/api/hello`
- `http://localhost:8081/api/numbers`
- `http://localhost:8081/api/echo`

Parar y borrar contenedores:

```bash
docker-compose down
```
