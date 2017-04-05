package me.yoryor.dp.bridge;

/**
 * Basic Class -- Provide basic function. use composition instead of directly subclass.
 */
public abstract class Car {

    // use protected so that can be extended.
    protected CarImpl carImpl;

    public Car(CarImpl carImpl) {
        this.carImpl = carImpl;
    }

    public abstract void move();

    public abstract void stop();

    public CarImpl getImpl() {
        return carImpl;
    }
}
