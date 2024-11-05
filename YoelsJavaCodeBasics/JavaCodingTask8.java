public class JavaCodingTask8 {
    public static void main(String[] args){
        // number 8: Maximum and minimum number is the array

        int[][] matrix = {
                {14, 18, 24},
                {91, 64, 39},
                {74, 11, 10}
        };

        int min=matrix[0][0];
        int max=matrix[0][0];

        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min=matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("The minimum is: " +min);
        System.out.println("The maximum is: " +max);
    }
}
