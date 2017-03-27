package me.yoryor.java;

public class GreetingImpl implements Greeting {
    private Greeting greeting;

    public GreetingImpl(Greeting greeting) {
        this.greeting = greeting;
    }

    public Greeting getGreeting() {
        return greeting;
    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public String hello() {
        return greeting.hello();
    }

    @Override
    public String bye() {
        return greeting.bye();
    }
}
