package org.example.project1;

public class Q8Project1 {
    public static void main(String[] args) {
        int[] numbers = {113,245,417,922,888};


        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest number: " + secondLargest);

    }
}
