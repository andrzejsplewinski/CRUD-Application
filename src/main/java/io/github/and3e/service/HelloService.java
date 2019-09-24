package io.github.and3e.service;

import io.github.and3e.model.Lang;
import io.github.and3e.repository.LangRepository;

import java.util.Optional;

public class HelloService {
    static final String FALLBACK_NAME = "world";
    private static final Lang FALLBACK_LANG = new Lang(1L, "Hello", "en");

    private LangRepository repository;

    public HelloService() {
        this(new LangRepository());
    }

    public HelloService(LangRepository repository) {
        this.repository = repository;
    }

    public String prepareGreeting(String name){
        return prepareGreeting(name, FALLBACK_LANG.getId());
    }

    public String prepareGreeting(String name, Long langId){
        String welcomeMsg = repository.findById(langId).orElse(FALLBACK_LANG).getWelcameMsg();
        String nameToWelcome = Optional.ofNullable(name).orElse(FALLBACK_NAME);
        return welcomeMsg + " " + nameToWelcome + "!";
    }
}
