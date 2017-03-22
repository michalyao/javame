package me.yoryor.javame.dp.ad.domain;

import me.yoryor.javame.dp.ad.AbstractDocument;

import java.util.Map;

public class MetricMonitorParam extends AbstractDocument implements HasHostName, HasIp, HasMetric {
    public MetricMonitorParam(Map<String, Object> properties) {
        super(properties);
    }
}
