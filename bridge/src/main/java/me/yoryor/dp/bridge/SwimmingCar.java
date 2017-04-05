package me.yoryor.dp.bridge;

public class SwimmingCar extends Car {

    public SwimmingCar(SwimmingCarImpl carImpl) {
        super(carImpl);
    }

    public SwimmingCarImpl getImpl() {
        return (SwimmingCarImpl) carImpl;
    }

    @Override
    public void move() {
        getImpl().moveImpl();
    }

    @Override
    public void stop() {
        getImpl().stopImpl();
    }

    public void swim() {
        getImpl().swimImpl();
    }
}
