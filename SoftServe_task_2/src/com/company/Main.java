package com.company;

public class Main{

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input();
        person1.output();
        System.out.println();
        Person person2 = new Person();
        person2.input();
        person2.output();
        System.out.println();
        person2.changeName("Akuna","Matata");
        person2.output();
        System.out.println();

        Employee employee1 = new Employee("Vanya",10,40);
        Employee employee2 = new Employee("Egor",15,60);
        Employee employee3 = new Employee("Alex",12,34);

        System.out.println();
        System.out.println(Employee.getTotalSum());
        System.out.println();
        employee1.changeRate(20);
        System.out.println(Employee.getTotalSum());




    }
}
