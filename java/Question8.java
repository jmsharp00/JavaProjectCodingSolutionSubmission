public class Question8 {
    public static void main(String[] args) {
        //8. Write a Java program to find the second largest number in the array.

        int [] numbers={47, 78, 2, 31, 89, 62, 19, 0};
        int largest = 0;
        int secondLargest = 0;

        for (int number: numbers) {
            if (number> largest) {
                secondLargest = largest;
                largest = number;
            } else if (number> secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}


