public class Q3 {
    public static void main(String[] args) {

        //Emir A.
        // Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program that will identify/print the even numbers only.

        int[][] numbers = {
                {75, 95, 85, 100, 88, 98, 99},
                {11, 25, 45, 69, 78, 45, 15},
                {87, 96, 58, 72, 37, 95, 46}
        };

        for (int [] row :numbers){
            for (int n:row ){
            if (n%2==0){
                System.out.println(n);}

        }













    }
}}
