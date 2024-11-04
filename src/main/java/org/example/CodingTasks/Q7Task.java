package org.example.CodingTasks;

public class Q7Task {
    public static void main(String[] args) {
        //7. Write a Java Program to print the first 10 numbers of the Fibonacci series.

        int[] fibonacci = new int[5]; //

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Fibonacci sequence up to " + fibonacci.length + " terms:");
        for (int i = 0; i<fibonacci.length; i++) {
            System.out.print(fibonacci[i] + (i < fibonacci.length - 1 ? ", " : ""));
        }
    }
}
