package com.company;

public class Teacher extends Staff {

   final Class<Teacher> TYPE_PERSON;

    public Teacher() {
        this.TYPE_PERSON = Teacher.class;
    }



    @Override
    public int salary() {
        return 1000;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
