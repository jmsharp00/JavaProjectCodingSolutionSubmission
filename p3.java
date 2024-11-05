public class p3 {

    public static void main(String[] args) {

    //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program that will identify/print the even numbers only.

        int [][] numbers = {
                {10, 12, 14, 16, 18},
                {11, 13, 15, 17, 19},
                {1, 2, 3, 4, 5}
        };

        for (int i =0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j]%2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}
