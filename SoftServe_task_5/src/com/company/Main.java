package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Cleaner cleaner1 = new Cleaner();
        Cleaner cleaner2 = new Cleaner();
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        Person[] persons = {student1, student2, cleaner1, cleaner2, teacher1, teacher2};

        for (int i = 0; i < persons.length; i++) {
            persons[i].print();
            if(persons[i] instanceof Staff){
                System.out.println(((Staff)persons[i]).salary());
            }
        }

        System.out.println();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Animal[] animals = {cat1, cat2, dog1, cat3, dog2, dog3};
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Food for this animal = " + animals[i].feed());
            System.out.println("Voice this animal is " + animals[i].voice());
        }
    }
}
