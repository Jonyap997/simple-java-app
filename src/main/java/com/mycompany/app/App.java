package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I love Jenkins, but I'm going to simulate a test failure";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Hello there ! I am changing this app's content!! x2");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
