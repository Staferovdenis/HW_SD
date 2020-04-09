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

        try {
            System.out.println("Please, enter surname, name and patronymic");
            String str = reader.readLine();
            String[] s = str.split(" ");
            System.out.println(s[0] + " " + s[1].substring(0, 1) + "." + s[2].substring(0, 1) + ".");
            System.out.println(s[1]);
            System.out.println(s[1] + " " + s[2] + " " + s[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }

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
