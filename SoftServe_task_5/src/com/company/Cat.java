package com.company;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "Meow";
    }

    @Override
    public String feed() {
        return "Fish";
    }
}
