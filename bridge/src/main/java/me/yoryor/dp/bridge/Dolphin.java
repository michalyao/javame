package me.yoryor.dp.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dolphin extends SwimmingCarImpl {
    private static final Logger LOG = LoggerFactory.getLogger(Dolphin.class);

    @Override
    public void swimImpl() {
        LOG.info("Dolphin swim");
    }

    @Override
    public void moveImpl() {
        LOG.info("Dolphin move");
    }

    @Override
    public void stopImpl() {
        LOG.info("Dolphin stop");
    }
}
