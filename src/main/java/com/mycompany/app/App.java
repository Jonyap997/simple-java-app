package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I love Jenkins, simulate failure to test email notifications";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Hello there ! I am changing this app's content!! Testing the webhook");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
