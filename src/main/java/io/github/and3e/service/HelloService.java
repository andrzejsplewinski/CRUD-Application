package io.github.and3e.service;

import java.util.Optional;

public class HelloService {
    static final String FALLBACK_NAME = "world";

    public String prepareGreeting(String name){
        return "Hello " + Optional.ofNullable(name).orElse(FALLBACK_NAME) + "!";
    }
}
