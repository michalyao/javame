package me.yoryor.javame.dp.ad;


import me.yoryor.javame.dp.ad.domain.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> properties = new HashMap<>();
        properties.put(HasIp.PROPERTY, "10.1.10.1");
        properties.put(HasHostName.PROPERTY, "ubuntu-laptop");
        properties.put(HasMetric.PROPERTY, "system.cpu.idle");
        properties.put(HasApp.PROPERTY, "mysql");

        AppMonitorParam appMonitorParam = new AppMonitorParam(properties);
        MetricMonitorParam metricMonitorParam = new MetricMonitorParam(properties);

        System.out.println(appMonitorParam.getHost().get());
        System.out.println(appMonitorParam.getHostName().get());
    }
}
