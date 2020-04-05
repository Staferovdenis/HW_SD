package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
        for (int i = 0; i < 7; i++) {
            employeeMap.put(i, "employee" + i);
        }
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Please enter the ID");
        int numberId = sc.nextInt();
        System.out.println("Please enter the name of employee");
        String name = sc.next();
        System.out.println();
        int id = 0;
        int name1 = 0;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            if (key.equals(numberId)) {
                System.out.println(entry.getValue());
                id = 1;
            }
            if (value.equals(name)) {
                System.out.println(entry.getKey());
                name1 = 1;
            }
        }
        if (name1 == 0) {
            System.out.println("Don`t have name");
        }
        if (id == 0) {
            System.out.println("Don`t have id");
        }

    }

}

