package com.thoughtworks.legacycode.remove_duplication;

public class Dog implements Animal {
    @Override
    public boolean likes(String thing) {
        return false;
    }

    @Override
    public String name() {
        return null;
    }
}
