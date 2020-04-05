package com.company;


import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(i);
        }
        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        for (Integer i : newCollection) {
            System.out.println(i);
        }
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 8) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println();
        for (Integer i : myCollection) {
            System.out.println(i);
        }
        System.out.println();
        myCollection.add(1, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i + "; value of element = " + myCollection.get(i));
        }
        Collections.sort(myCollection);
        for (Integer i : myCollection) {
            System.out.println(i);
        }
    }


}
