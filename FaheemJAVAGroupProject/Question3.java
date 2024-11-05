public class Question3 {
    public static void main(String[] args) {
        //3. Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program that will identify/print the even numbers only.

        int [][] values =  {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int [] row : values){
            for(int n : row){
                if (n % 2 == 0){
                    System.out.println(n);
                }
            }

        }
    }

}
