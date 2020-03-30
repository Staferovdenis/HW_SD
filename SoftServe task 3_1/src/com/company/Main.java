package com.company;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog Terrier = new Dog("Tery",4, Dog.Breed.Basenji);
        Dog dog = new Dog("Tery",5, Dog.Breed.Terrier);
        Dog jax = new Dog("Jax",9, Dog.Breed.Beagle);

        System.out.println(chekName(Terrier,dog));

        if(Terrier.getAge()<dog.getAge() && dog.getAge()> jax.getAge()){
            System.out.println("dog is oldest dog");
        }else if(jax.getAge()>Terrier.getAge()&&jax.getAge()>dog.getAge()){
            System.out.println("jax is oldest dog");
        }else System.out.println("Terrier is oldest dog");


        /*System.out.println("Enter you error code");
        switch (sc.nextInt()) {
            case 400 :
                HTTPError httpError400 = HTTPError.valueOf("BAD_REQUEST");
                System.out.println(httpError400);
                break;
            case 401:
                HTTPError httpError401 = HTTPError.valueOf("Unauthorized");
                System.out.println(httpError401);
                break;
            case 402 :
                HTTPError httpError402 = HTTPError.valueOf("Payment_Required");
                System.out.println(httpError402);
                break;
        }
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        float number3 = sc.nextFloat();

        if(number1 > -5.0 && number1 < 5.0 && number2 > -5.0 && number2 < 5.0&&number3 > -5.0 && number3 < 5.0){
            System.out.println("Good");
        }else System.out.println("Badly");
        System.out.println();

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max = MIN_VALUE;
        int min = MAX_VALUE;
        if (n1 > max) max = n1;
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;

        if (n1 < min) min = n1;
        if (n2 < min) min = n3;
        if (n3 < min) min = n3;

        System.out.println("Max = " + max + "; " + "Min = " + min);*/
    }
    public static boolean chekName(Object a,Object b){
        return a.equals(b);
    }

   public enum HTTPError{
        BAD_REQUEST(400),Unauthorized(401),Payment_Required(402);
       private final int namberEr;

       HTTPError(int namber){
           this.namberEr = namber;
       }

       public int getNamberEr() {
           return namberEr;
       }
   }
}
