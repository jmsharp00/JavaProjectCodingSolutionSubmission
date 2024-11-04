public class Q2 {
    public static void main(String[] args) {

        //Emir A.
        // Create an array of integer values. After the array is created,
        // calculate the sum of all stored elements in that array.

        int[] num = {75, 95, 85, 100, 88, 98, 99};
        int sum=0;

        for (int n:num){

            sum=sum+n;

        }
        System.out.println("Sum of all stored elements is: "+sum);

    }
}
