package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Country country1 = Country.valueOf("UKRAINE");
        Country country2 = Country.valueOf("CHINA");
        System.out.println(country1.getMainland());
        System.out.println(country2.getMainland());

        System.out.println();

        Product PS4Slim = new Product("PS4 Slim", 400, 130);
        Product PS4 = new Product("PS4", 300, 27);
        Product PS4Pro = new Product("PS4 Pro", 600, 43);
        Product PS3 = new Product("PS3", 250, 11);

        if (PS4Slim.getPrice() < PS4.getPrice()) {
            System.out.println("Expensive price " + PS4.getName() + ": " + "Quantity = " + PS4.getQuantity());
        } else if (PS4Slim.getPrice() < PS4Pro.getPrice()) {
            System.out.println("Expensive price " + PS4Pro.getName() + ": " + "Quantity = " + PS4Pro.getQuantity());
        } else if (PS4Slim.getPrice() < PS3.getPrice()) {
            System.out.println("Expensive price " + PS3.getName() + ": " + "Quantity = " + PS3.getQuantity());
        } else
            System.out.println("Expensive price " + PS4Slim.getName() + ": " + "Quantity = " + PS4Slim.getQuantity());


        if (PS4Slim.getQuantity() < PS4.getQuantity()) {
            System.out.println("Biggest quantity is " + PS4.getName());
        } else if (PS4Slim.getQuantity() < PS4Pro.getQuantity()) {
            System.out.println("Biggest quantity is " + PS4Pro.getName());
        } else if (PS4Slim.getQuantity() < PS3.getQuantity()) {
            System.out.println("Biggest quantity is " + PS3.getName());
        } else
            System.out.println("Biggest quantity is " + PS4Slim.getName());

        System.out.println();

        System.out.println("Please enter the day number of the week from 0 to 6");
        int dayOfWeek = sc.nextInt();
        switch (dayOfWeek) {
            case 0:
                System.out.println("Monday, Понедельник, Понеділок");
                break;
            case 1:
                System.out.println("Tuesday, Вторник, Вівторок");
                break;
            case 2:
                System.out.println("Wednesday, Среда, Середа");
                break;
            case 3:
                System.out.println("Thursday, Четверг, Четверг");
                break;
            case 4:
                System.out.println("Friday, Пятница, П'ятниця");
                break;
            case 5:
                System.out.println("Saturday, Субота, Субота");
                break;
            case 6:
                System.out.println("Sunday, Воскресенье, Неділя");
                break;
        }

        System.out.println();

        System.out.println("Please enter 3 number");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        if (a1 % 2 == 0) {
            System.out.println("Even = " + a1);
        } else {
            System.out.println("Odd = " + a1);
        }
        if (a2 % 2 == 0) {
            System.out.println("Even = " + a2);
        } else {
            System.out.println("Odd = " + a2);
        }
        if (a3 % 2 == 0) {
            System.out.println("Even = " + a3);
        } else {
            System.out.println("Odd = " + a3);
        }
    }
    public enum Country {
        UKRAINE("EUROPE"), CHAD("AFRICA"), CHINA("ASIA");
        private final String mainland;

        Country(String mainl) {
            this.mainland = mainl;
        }

        public String getMainland() {
            return mainland;
        }
    }
}
