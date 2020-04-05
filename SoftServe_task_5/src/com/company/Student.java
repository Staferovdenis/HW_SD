package com.company;

public class Student extends Person {

    final Class<Student> TYPE_PERSON;

    public Student() {
        this.TYPE_PERSON = Student.class;
    }


    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
