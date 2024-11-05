package org.example;


//3. Create a 2D array or integer type where you will store odd and even numbers.
//Develop a program that will identify/print the even numbers only.

public class Ex3 {
    public static void main(String[] args) {

        int[][] numbers = {
                {2, 4, 6, 7, 8, 9},
                {56, 88, 99, 10},
                {45, 22, 14, 79}
        };

        for (int rows = 0; rows < numbers.length; rows++) {
            for (int n : numbers[rows]) {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }
            }
        }

    }
}
