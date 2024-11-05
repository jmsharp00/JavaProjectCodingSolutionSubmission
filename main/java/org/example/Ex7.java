package org.example;


//Write a Java Program to print the first 10 numbers of the Fibonacci series.
public class Ex7 {
    public static void main(String[] args) {
        int len = 10;
        int firstN = 0;
        int secondN = 1;

        for (int i = 0; i < len; i++) {
            System.out.print(firstN + " ");
            int next = firstN + secondN;
            firstN = secondN;
            secondN = next;

        }
    }
}

