public class JavaCodingTask5 {
    public static void main(String[] args){
// create a 2D array of integers
//  Develop a program that calculates the sum of even numbers and odd numbers separately.
        int[][] matrix = {
                {44, 45, 91},
                {35, 39, 54},
                {29, 72, 84}
        };
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sumEven = sumEven + matrix[i][j];
                } else {
                    sumOdd = sumOdd + matrix[i][j];
                }
            }
        }
        System.out.println("Sum of Even Numbers: " +sumEven);
        System.out.println("Sum of Odd Numbers: " +sumOdd);
    }
}
