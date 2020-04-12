package com.company;

public class MyThread extends Thread {
    private String name;
    private int sleepTime;
    private String phrase;

    public MyThread(String phrase) {
        this.phrase = phrase;
    }

    public MyThread(String name, int sleepTime, String phrase) {
        this.name = name;
        this.sleepTime = sleepTime;
        this.phrase = phrase;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(phrase);

        }
    }
}
