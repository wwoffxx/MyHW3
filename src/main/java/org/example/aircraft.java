package org.example;

public interface aircraft {

    default String fly() {
        return "I am flying!";
    }

    private String work() {
        return "I am working well!";
    }
}
