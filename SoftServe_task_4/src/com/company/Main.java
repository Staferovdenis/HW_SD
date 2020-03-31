package com.company;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number of department");
        int numberDepartment = sc.nextInt();

        Employee employee1 = new Employee("Alex", 2, 1500);
        Employee employee2 = new Employee("Joy", 1, 2500);
        Employee employee3 = new Employee("Mike", 1, 3000);
        Employee employee4 = new Employee("Clara", 2, 1000);
        Employee employee5 = new Employee("Valerian", 3, 5000);

        Employee[] employers = {employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < employers.length; i++) {
            if (employers[i].getDepartmentNumber() == numberDepartment) {
                System.out.println(employers[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < employers.length - 1; i++) {
            for (int j = 0; j < employers.length - 1; j++) {
                if (employers[j].getSalary() < employers[j + 1].getSalary()) {
                    Employee tmp = employers[j + 1];
                    employers[j + 1] = employers[j];
                    employers[j] = tmp;
                }
            }
        }
        for (Employee e : employers) {
            System.out.println(e);
        }

        System.out.println();

        int[] array = {-33, 33, -42, 45, 123, 5555, -43, 666, -4, 3};
        int countPositive = 0;
        int countNegative = 0;
        int max = MIN_VALUE;
        int sumPositive = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] > 0) {
                countPositive++;
                sumPositive += array[i];
            } else {
                countNegative++;
            }
        }
        if (countNegative > countPositive) {
            System.out.println("Negative numbers more");
        } else System.out.println("Positive numbers more");
        System.out.println("Maximum = " + max);
        System.out.println("Sum positive numbers = " + sumPositive);
        System.out.println("Negative numbers = " + countNegative);
    }
}
