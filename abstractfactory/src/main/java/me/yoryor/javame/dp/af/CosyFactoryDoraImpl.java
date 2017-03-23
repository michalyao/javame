package me.yoryor.javame.dp.af;

public class CosyFactoryDoraImpl implements CosyFactory {
    @Override
    public Book book() {
        return new DoraBook();
    }

    @Override
    public Glasses glasses() {
        return new DoraGlasses();
    }

    @Override
    public Pen pen() {
        return new DoraPen();
    }
}
