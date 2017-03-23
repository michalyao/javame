package me.yoryor.javame.dp.af;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private Book book;
    private Pen pen;
    private Glasses glasses;

    public void createCosy(CosyFactory factory) {
        setBook(factory.book());
        setPen(factory.pen());
        setGlasses(factory.glasses());
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Glasses getGlasses() {
        return glasses;
    }

    public void setGlasses(Glasses glasses) {
        this.glasses = glasses;
    }

    public static void main(String[] args) {
        Main main = new Main();
        CosyFactory factory = new CosyFactoryAmonImpl();
        main.createCosy(factory);
        LOG.info("dora-cosy");
        LOG.info("book->{}", main.getBook().getDesc());
        LOG.info("pen->{}", main.getPen().getDesc());
        LOG.info("glasses->{}", main.getGlasses().getDesc());

        System.out.println();
        factory = new CosyFactoryDoraImpl();
        main.createCosy(factory);
        LOG.info("amon-cosy");
        LOG.info("book->{}", main.getBook().getDesc());
        LOG.info("pen->{}", main.getPen().getDesc());
        LOG.info("glasses->{}", main.getGlasses().getDesc());
    }
}
