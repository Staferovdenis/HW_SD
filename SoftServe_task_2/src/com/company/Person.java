package com.company;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){
        return 2020 - birthYear;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter firstName , lastName , birthYear");
        this.firstName = scanner.next();
        this.lastName = scanner.next();
        this.birthYear = scanner.nextInt();
    }

    public void output(){
        System.out.println(firstName + " " + lastName + " " + getAge() + " years old");
    }

    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
