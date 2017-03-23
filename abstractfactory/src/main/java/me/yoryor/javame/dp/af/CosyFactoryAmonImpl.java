package me.yoryor.javame.dp.af;

public class CosyFactoryAmonImpl implements CosyFactory {
    @Override
    public Book book() {
        return new AmonBook();
    }

    @Override
    public Glasses glasses() {
        return new AmonGlasses();
    }

    @Override
    public Pen pen() {
        return new AmonPen();
    }
}
