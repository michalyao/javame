package me.yoryor.javame.dp.ad.domain;

import me.yoryor.javame.dp.ad.AbstractDocument;

import java.util.Map;

public class AppMonitorParam extends AbstractDocument implements HasApp, HasIp, HasHostName {

    public AppMonitorParam(Map<String, Object> properties) {
        super(properties);
    }
}
