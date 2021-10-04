package com.verybadcompany.app.cwe;

import java.util.Random;

/**
 * CWE-330 Predicatable random
 */
public class CWE330 implements CWEExample {

    public void run() {
        generateSecretToken();
    }

    String generateSecretToken() {
        Random r = new Random();
        return Long.toHexString(r.nextLong());
    }

}
