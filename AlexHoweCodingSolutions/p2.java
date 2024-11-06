public class p2 {

    public static void main(String[] args) {

        //Create an array of integer values. After the array is created,
        //calculate the sum of all stored elements in that array.

        int [] values = {90, 80, 70, 60, 50, 30, 20, 10};
        int sum = 0;
        for (int value : values) {
            sum += value;
        }

        System.out.println("The sum is " + sum);
    }
}
