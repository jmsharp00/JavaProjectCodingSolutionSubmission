public class Question4 {
    public static void main(String[] args) {
        //4. Create a 2D array of integers. Develop a program that will calculate the sum of even and
        // odd numbers separately for that array.

        int [][] values =  {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int evenSum = 0;
        int oddSum = 0;
        for (int [] row : values){
            for(int n : row){
                if (n % 2 == 0){
                    evenSum = evenSum + n;

                }else {
                    oddSum = oddSum + n;
                }
            }

        }
        System.out.println("Sum of Even Numbers " + evenSum);
        System.out.println("Sum of Odd Numbers " + oddSum);
    }
}
