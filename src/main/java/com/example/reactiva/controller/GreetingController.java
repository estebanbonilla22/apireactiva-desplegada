package com.example.reactiva.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Hola mundo reactivo!");
    }

    @GetMapping(value = "/numbers", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> numbers() {
        return Flux.range(1, 10)
                .delayElements(Duration.ofSeconds(1));
    }

    @PostMapping("/echo")
    public Mono<String> echo(@RequestBody String message) {
        return Mono.just("Recibido: " + message);
    }
}
