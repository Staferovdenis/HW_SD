package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = "username_777";
        String s2 = "userna123";
        String s3 = "us!";
        String s4 = "username_777234123123";
        String s5 = "use_WW123";
        answer(chekUserName(s1));
        answer(chekUserName(s2));
        answer(chekUserName(s3));
        answer(chekUserName(s4));
        answer(chekUserName(s5));

        String surname = "staferov";
        String name = "denis";
        String patronymic = "yurievich";
        StringBuilder r = new StringBuilder();
        r.append(surname).append(" "+name).append(" "+patronymic);
        r.delete(10,14);
        r.delete(12,21);
        System.out.println(r);
        r.delete(0,12);
        r.append(name);
        System.out.println(r);
        r.append(" "+patronymic).append(" "+surname);
        System.out.println(r);

        System.out.println();

        try {
            System.out.println("Please enter two string");
            String first = reader.readLine();
            String second = reader.readLine();
            if (second.startsWith(first)) {
                System.out.println("First string is a substring of second");
            } else System.out.println("First string is NOT a substring of second");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean chekUserName(String userName) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9.-_*]{3,15}$");
        Matcher m = p.matcher(userName);
        return m.matches();
    }

    public static void answer(boolean b) {
        if (b) {
            System.out.println("Nice user name)");
        } else System.out.println("Invalid");
    }
}
