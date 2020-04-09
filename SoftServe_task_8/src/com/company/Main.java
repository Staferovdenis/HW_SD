package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            Plant plant1 = new Plant(23, "red", "rose");
            Plant plant2 = new Plant(22, "green", "narcissus");
            Plant plant3 = new Plant(21, "green", "rose");
            System.out.println(plant1 + " " + plant2 + " " + plant3);
        } catch (ColorException | TypeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        try {
            System.out.println("Enter two numbers");
            String s = r.readLine();
            String s1 = r.readLine();
            int a = Integer.parseInt(s);
            int b = Integer.parseInt(s1);
            r.close();
            System.out.println("Rectangle square = " + squareRectangle(a, b));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static int squareRectangle(int a, int b) {
        return a * b;
    }

}
