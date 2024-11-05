package org.example;


//5. Write a program to swap 2 numbers without a temporary variable.
public class Ex5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        a = a+b;

        b = a-b;
        a = a-b;

        System.out.println("Swapped a: "+a);
        System.out.println("Swapped b: "+b);

    }
}
