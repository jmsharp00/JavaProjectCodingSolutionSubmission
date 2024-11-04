public class Q4 {
    public static void main(String[] args) {

        //Emir A.
        // Create a 2D array of integers.
        // Develop a program that will calculate the sum of even and odd numbers for that array.

        int[][] numbers = {
                {75, 95, 85, 100, 88, 98, 99},
                {11, 25, 45, 69, 78, 45, 15},
                {87, 96, 58, 72, 37, 95, 46}
        };

        int sumEven=0;
        int sumOdd=0;

        for (int [] row :numbers){
            for (int n:row ){
            if (n%2==0){
                sumEven=sumEven+n;
                }
            else {sumOdd=sumOdd+n;}

        }













    }System.out.println("Sum of Even Numbers is: "+sumEven);
        System.out.println("Sum of Even Numbers is: "+sumOdd);
}}
