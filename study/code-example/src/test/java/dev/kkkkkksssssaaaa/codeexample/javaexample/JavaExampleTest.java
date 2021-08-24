package dev.kkkkkksssssaaaa.codeexample.javaexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaExampleTest {

    @Test
    void varArgsTest() {
        String[] strArr = { "100", "200", "300" };

//        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("", new String[] { "100", "200", "300" }));
    }


    private String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }

        return result;
    }

    private String concatenate(String... args) {
        return concatenate("", args);
    }

}