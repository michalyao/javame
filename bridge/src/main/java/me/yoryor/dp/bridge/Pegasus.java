package me.yoryor.dp.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pegasus extends FlyingCarImpl {
    private static final Logger LOG = LoggerFactory.getLogger(Pegasus.class);

    @Override
    public void moveImpl() {
        LOG.info("Moving Pegasus");
    }

    @Override
    public void stopImpl() {
        LOG.info("Stopped Pegasus");
    }

    @Override
    public void flyImpl() {
        LOG.info("Flying Pegasus");
    }
}
