public class p8 {

    public static void main(String[] args) {

    // Write a Java program to find the second largest number in the array.

        int [] numbers={7, 29, 34, 89, 101, 15, 16};
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second largest number: " + second );
    }
}
