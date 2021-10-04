package com.verybadcompany.app.cwe;

/**
 * CWE-78 Potential Command Injection
 */
public class CWE78 implements CWEExample {

    public void run(String input) throws Exception {
        Runtime r = Runtime.getRuntime();
        r.exec("/bin/sh -c some_tool" + input);
    }

}
