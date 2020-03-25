package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Vanya",10,40);
        Employee employee2 = new Employee("Egor",15,60);
        Employee employee3 = new Employee("Alex",12,34);


        System.out.println(employee1.totalSum());
        System.out.println(employee1.totalSum() + employee2.totalSum() + employee3.totalSum());//400+900+408(40+90+40)=1878

        employee1.changeRate(20);
        System.out.println(employee1.totalSum());
        System.out.println(employee1.totalSum() + employee2.totalSum() + employee3.totalSum());//


    }
}
