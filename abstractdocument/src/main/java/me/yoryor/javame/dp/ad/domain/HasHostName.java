package me.yoryor.javame.dp.ad.domain;

import me.yoryor.javame.dp.ad.Document;

import java.util.Optional;

public interface HasHostName extends Document {

    String PROPERTY = "hostName";

    default Optional<String> getHostName() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
