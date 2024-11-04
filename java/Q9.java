public class Q9 {
    public static void main(String[] args) {

        //Emir A.
        // Write a Java program to find the second largest number in the array


        int[] numbers = {12, 45, 86, 1000, 95, 75, 41, 110, 1123};
        int largest = 0;
        int secondlargest = 0;


        for (int n : numbers) {
            if (n > largest) {
                secondlargest = largest;
                largest=n;
            } else if (n > secondlargest && n < largest) {
                secondlargest = n;

            }


        }
        System.out.println("Second largest = " + secondlargest);


    }
}
