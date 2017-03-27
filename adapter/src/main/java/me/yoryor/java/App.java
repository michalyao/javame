package me.yoryor.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);
    public App() {
        Greeting greeting = new GreetingImpl(new ChattingAdapter());
        LOG.info(greeting.hello());
        LOG.info(greeting.bye());
    }


    public static void main( String[] args ) {
        new App();
    }
}
