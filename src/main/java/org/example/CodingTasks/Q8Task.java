package org.example.CodingTasks;

public class Q8Task {
    public static void main(String[] args) {
        //8. Maximum and minimum number in the array?

        int[][] matrix = {
                {29, 34, 42},
                {95, 90, 18},
                {24, 21, 20}
        };

        int min=matrix[0][0];
        int max=matrix[0][0];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min=matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("The minimum is: "+min);
        System.out.println("The maximum is: "+max);
    }
}
