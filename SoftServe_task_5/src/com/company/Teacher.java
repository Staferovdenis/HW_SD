package com.company;

public class Teacher extends Staff {

    String TYPE_PERSON;

    public Teacher() {
    }

    @Override
    public int salary() {
        return 1000;
    }

    @Override
    public void print() {
        System.out.println("I am a Teacher");
    }
}
