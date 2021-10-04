package com.verybadcompany.app;

import java.util.Random;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
        System.out.println(app.generateSecretToken());
    }

    String generateSecretToken() {
        Random r = new Random();
        return Long.toHexString(r.nextLong());
    }

    private final String getMessage() {
        return message;
    }

}
