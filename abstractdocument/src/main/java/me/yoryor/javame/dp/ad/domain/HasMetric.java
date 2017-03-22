package me.yoryor.javame.dp.ad.domain;

import me.yoryor.javame.dp.ad.Document;

import java.util.Optional;

public interface HasMetric extends Document {

    String PROPERTY = "metric";

    default Optional<String> getMetric() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
