package me.yoryor.dp.bridge;

public class App {
    public static void main(String[] args) {
        FlyingCar flyingCar = new FlyingCar(new Pegasus());
        flyingCar.move();
        flyingCar.stop();
        flyingCar.fly();

        SwimmingCar swimmingCar = new SwimmingCar(new Dolphin());
        swimmingCar.move();
        swimmingCar.stop();
        swimmingCar.swim();
    }
}
