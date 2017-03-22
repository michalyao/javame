package me.yoryor.javame.dp.ad.domain;

import me.yoryor.javame.dp.ad.Document;

import java.util.Optional;

public interface HasIp extends Document {

    String PROPERTY = "ipAddr";

    default Optional<String> getIp() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}

