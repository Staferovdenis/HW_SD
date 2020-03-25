package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius");
        double Pi = 3.1415d;
        double radius = scanner.nextDouble();
        double S = Pi * (radius * radius);
        double P = 2 * Pi * radius;
        System.out.println("S = " + S);
        System.out.println("P = " + P);

        System.out.println();


        System.out.println("What is you name?");
        String name = scanner.next();
        System.out.println("Where are you live, " + name);
        String address = scanner.next();
        System.out.println(name + " live in " + address + ".");

        System.out.println();

        System.out.println("Please enter 3 tariff standart units");
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int c3 = scanner.nextInt();
        System.out.println("Please enter 3 period of time in minutes?");
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();
        int result1 = c1 * t1;
        int result2 = c2 * t2;
        int result3 = c3 * t3;
        System.out.println("First c1 + t1 = " + result1 );
        System.out.println("Second c2 + t2 = " + result2);
        System.out.println("Third c3 + t3 = " + result3);
        System.out.println("All = " +(result1 + result2 + result3));

    }
}
