package me.yoryor.dp.delegate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EjbService implements BusinessService {
    private static final Logger logger = LoggerFactory.getLogger(EjbService.class);

    @Override
    public void doProcessing() {
        logger.info("Ejb Service is now processing...");
    }
}
