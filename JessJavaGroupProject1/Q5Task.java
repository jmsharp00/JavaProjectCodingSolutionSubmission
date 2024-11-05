package org.example.CodingTasks;

public class Q5Task {
    public static void main(String[] args) {
        //5. Write a program to swap 2 numbers without a temporary variable.
        int a=1;
        int b=2;

        System.out.println("Before swapping: a = "+a+" and b = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = "+a+" and b = "+b);

        }
    }

