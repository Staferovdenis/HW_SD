package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Main {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        FileReader fr = new FileReader("C:\\Users\\d.staferov\\IdeaProjects\\SoftServe_task_9\\src\\com\\company\\mytext.txt");
        BufferedReader br = new BufferedReader(fr);
        List<String> strings = new ArrayList<>();
        int maxLength = MIN_VALUE;
        int minLength = MAX_VALUE;
        String str = null;
        try {
            while ((str = br.readLine()) != null) {
                strings.add(str);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sum = 0;
        String stringCoincidence = "var";
        int countStringCoincidence = 0;
        for (String s : strings) {
            if (s.contains(stringCoincidence)) {
                countStringCoincidence++;
            }
            if (s.length() < minLength) {
                minLength = s.length();
            }
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
            sum += s.length();
//            System.out.println(s);
        }
        System.out.println();
        System.out.println("Total sum of symbols in array = " + sum);
        System.out.println("Max string length = " + maxLength);
        System.out.println("Min string length = " + minLength);
        System.out.println("This text contain word \"var\" = " + countStringCoincidence);

        Thread thread1 = new MyThread("thread1 go");
        Thread thread2 = new MyThread("thread2 go");
        Thread thread3 = new MyThread("thread3 go");

        thread1.setPriority(10);
        thread2.setPriority(10);
        thread3.setPriority(5);

        thread1.start();
        thread2.start();
//
//        thread1.join();
//        thread2.join();
        thread3.start();


        Thread t1 = new MyThread("1", 2000, "Hello world");
        Thread t2 = new MyThread("2", 3000, "Peace in the peace");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is Denis");


        String s = "I study Java";
        for (int i = 0; i < 10; i++) {
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
