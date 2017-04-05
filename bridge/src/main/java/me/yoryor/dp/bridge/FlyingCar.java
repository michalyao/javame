package me.yoryor.dp.bridge;

public class FlyingCar extends Car {
    public FlyingCar(FlyingCarImpl impl) {
        super(impl);
    }

    public FlyingCarImpl getImpl() {
        return (FlyingCarImpl) carImpl;
    }

    @Override
    public void move() {
        getImpl().moveImpl();
    }

    @Override
    public void stop() {
        getImpl().stopImpl();
    }

    public void fly() {
        getImpl().flyImpl();
    }
}
