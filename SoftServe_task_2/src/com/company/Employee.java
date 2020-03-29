package com.company;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee(){
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary(){
        return  this.rate * this.hours;
    }

    public int changeRate(int rate){
        int oldSalary = getSalary();
        totalSum -= oldSalary;
        this.rate = rate;
        int newSalary = getSalary();
        return totalSum += newSalary;
    }

    public int getBonuses(){
        return getSalary()/10;
    }

    private int totalSum(){
        return totalSum += getBonuses() + getSalary();
    }

    public static int getTotalSum() {
        return totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
