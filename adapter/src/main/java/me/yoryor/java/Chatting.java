package me.yoryor.java;

/**
 * Device class(adaptee)。reuse this class to implement the interface expected by client
 */
public class Chatting {
    public String hello() {
        return "Hello!";
    }

    public String byebye() {
        return "Bye bye!";
    }
}
