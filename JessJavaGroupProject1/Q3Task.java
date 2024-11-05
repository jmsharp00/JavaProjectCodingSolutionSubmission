package org.example.CodingTasks;

public class Q3Task {
    public static void main(String[] args) {
        //3.Create a 2D array or integer type where you will store odd and even numbers.
        //Develop a program that will identify/print the even numbers only.

        int[][] matrix = {
                {29, 34, 42},
                {95, 90, 18},
                {24, 21, 20}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]% 2 == 0) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
}
