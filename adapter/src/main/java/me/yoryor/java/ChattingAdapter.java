package me.yoryor.java;

/**
 * Adapter class. Adapts the interface of the device ({@link Chatting}) into {@link Greeting} client interface
 * reusing device class without changing its method. we can add delete features of the adaptee
 */
public class ChattingAdapter implements Greeting {
    private Chatting chatting;

    public ChattingAdapter() {
        chatting = new Chatting();
    }

    @Override
    public String hello() {
        return chatting.hello();
    }

    @Override
    public String bye() {
        return "Bye!";
    }
}
