package com.company;

public class Cleaner extends Staff {

  final Class<Cleaner> TYPE_PERSON;

    public Cleaner() {
        this.TYPE_PERSON = Cleaner.class;
    }


    @Override
    public int salary() {
        return 800;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
