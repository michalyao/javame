package me.yoryor.dp.delegate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JmsService implements BusinessService {
    private static final Logger logger = LoggerFactory.getLogger(JmsService.class);

    @Override
    public void doProcessing() {
        logger.info("JmsService now is processing.");
    }
}
