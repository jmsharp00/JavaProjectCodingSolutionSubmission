package JavaProject;

public class SecondLargestNumber08 {
    public static void main(String[] args) {
        int[]numbers={6,9,18,45,23,65,43,95};

        int largest = 0;
        int secondLargest = 0;

        for (int num: numbers) {
            if (num> largest) {
                secondLargest = largest;
                largest = num;
            } else if (num> secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest number is: " + secondLargest);

    }
}
