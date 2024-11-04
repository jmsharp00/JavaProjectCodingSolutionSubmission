package org.example;

public class CodingTask7 {
    public static void main(String[] args) {
//Write a Java Program to print the first 10 numbers of the Fibonacci series.
        int numbers = 10;
        int num1 = 0, num2 = 1;


        for (int i = 0; i <= numbers; i++) {
            System.out.println(num1 + " ");

            int next = num1 + num2;
            num1 = num2;
            num2 = next;

        }
    }
}