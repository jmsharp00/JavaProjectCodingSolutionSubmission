package org.example;
import java.util.Scanner;

public class CodingTask6 {
    public static void main(String[] args) {
//Write a Java program to check
// whether a given number is prime or not.
Scanner scan=new Scanner(System.in);
        System.out.println("Write down a number");
        int number=scan.nextInt();


        boolean isprime=true;

if(number<2){
   isprime=false;
}else {
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            isprime = false;
            break;
        }
    }
}
        if (isprime){
            System.out.println(number+" is a prime number");
        }   else{
            System.out.println(number+" is not a prime number");
        }

    }
}

