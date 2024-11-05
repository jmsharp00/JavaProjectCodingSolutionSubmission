package org.example.project1;

public class Q7Project1 {
    public static void main(String[] args) {
        int n1 =0;
        int n2 = 1;

        System.out.println("Fibonacci Series: ");
        for (int i =1; i<=10; i++){
            System.out.println(n1 +" ");
            int next =n1 + n2;
            n1 = n2;
            n2 =next;
        }
        }

    }
