package JavaCodingProject;

public class Task8 {
    public static void main(String[] args) {
        int[]numbers={12,19,8,4,33,26,44,22};

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
