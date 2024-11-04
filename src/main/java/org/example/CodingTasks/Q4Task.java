package org.example.CodingTasks;

public class Q4Task {
    public static void main(String[] args) {
        //4. Create a 2D array of integers.
        // Develop a program that will calculate the sum of even and odd numbers for that array.

        int[][] matrix = {
                {29, 34, 42},
                {95, 90, 18},
                {24, 21, 20}
        };
        int sumEven = 0;
        int sumOdd=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sumEven = sumEven + matrix[i][j];
                } else {
                    sumOdd = sumOdd + matrix[i][j];
                }
            }
        }
            System.out.println("Sum of Even Integers: "+sumEven);
            System.out.println("Sum of Odd Integers: "+sumOdd);
        }
    }

