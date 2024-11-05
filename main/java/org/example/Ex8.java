package org.example;

//Write a Java program to find the second largest number in the array.

public class Ex8 {
    public static void main(String[] args) {
        int[] numbers = {8, 14, 26, 120, 99};

        int largest = numbers[0];
        int secondLargest = numbers[1];

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
                continue;
            }
            if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("Second largest is: " + secondLargest);
    }
}
