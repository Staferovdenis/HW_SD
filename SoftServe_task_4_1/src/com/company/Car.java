package com.company;

public class Car {
    private int year;
    private int  engineCapacity;

    public Car(int year, int engineCapacity) {
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public int getYear() {
        return year;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
