package com.company;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberYear = sc.nextInt();
        Car car1 = new Car(2010, 2000);
        Car car2 = new Car(2011, 2100);
        Car car3 = new Car(2012, 2200);
        Car car4 = new Car(2011, 1900);
        Car car5 = new Car(2010, 1500);

        Car[] cars = {car1, car2, car3, car4, car5};

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() == numberYear) {
                System.out.println(cars[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() > cars[j].getYear()) {
                    Car tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("Please enter 5 integer numbers");
        int countPositive = 0;
        int countMinimal = 0;
        int positionPositiveNumber = 0;
        int productNumbers = 1;
        int min = MAX_VALUE;
        int[] ar = new int[5];
        int a;
        for (int i = 0; i < 5; i++) {
            a = sc.nextInt();
            if (a < 0) {
                System.out.println("Product of all entered even numbers " + productNumbers);
                break;
            } else {
                countPositive++;
                if (countPositive == 2) {
                    positionPositiveNumber = i;
                }
                ar[i] = a;
                if (ar[i] % 2 == 0) {
                    productNumbers *= a;
                }
                if (ar[i] < min) {
                    min = ar[i];
                    countMinimal = i;
                }
            }
        }
        System.out.println("Minimum = " + min + " position in array =  " + countMinimal);
        System.out.println("Positive position of second number is = " + positionPositiveNumber);
        System.out.println("Product of all even numbers = " + productNumbers);

        System.out.println();

        System.out.println("Enter the number of month?");
        int number = sc.nextInt();
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i < months.length; i++) {
            if (i == number) {
                System.out.println("There are " + months[i] + " days in this month.");
            }
        }
        System.out.println("");
        int[] numbers = new int[10];
        int sum5 = 0;
        int product5 = 1;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            numbers[i] = n;
        }
        for (int j = 0; j < numbers.length / 2; j++) {
            if (numbers[j] > 0) {
                sum5 += numbers[j];
            } else {
                for (int i = numbers.length / 2; i < numbers.length - 1; i++) {
                    product5 *= numbers[i];
                }
                sum5 = 0;
            }
        }
        System.out.println("Product 5 last numbers = " + product5 + " or sum first 5 numbers = " + sum5);

    }
}
