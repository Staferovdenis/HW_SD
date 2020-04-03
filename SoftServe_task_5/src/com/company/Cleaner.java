package com.company;

public class Cleaner extends Staff {

    String TYPE_PERSON;

    public Cleaner() {
    }

    @Override
    public int salary() {
        return 800;
    }

    @Override
    public void print() {
        System.out.println("I am a Cleaner");
    }
}
