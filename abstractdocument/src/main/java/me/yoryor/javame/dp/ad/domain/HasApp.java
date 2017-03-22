package me.yoryor.javame.dp.ad.domain;

import me.yoryor.javame.dp.ad.Document;

import java.util.Optional;

public interface HasApp extends Document {

    String PROPERTY = "app";

    default Optional<String> getHost() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
