package com.company;

public class Person {
    private int age;
    private int salary;

    public Person(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float salaryWithBonus(){
        if(age<25){
            return salary;
        }else if(age<30){
            return salary * 1.1f;
        }else{
            return salary * 1.25f;
        }
    }
    public void newSalary(){
        salary = (int) salaryWithBonus();
    }
}
