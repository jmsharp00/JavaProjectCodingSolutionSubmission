package org.example.CodingTasks;

public class Q9Task {
    public static void main(String[] args) {
        //9. Write a Java program to find the second-largest number in the array.

        int[] number={5, 29, 34, 42, 95, 90, 18};

        if (number.length < 2) {
            System.out.println("Array should have at least two elements");
        } else {
            int largest = 0;
            int secondLargest = 0;

            for (int num : number) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            if (secondLargest == 0) {
                System.out.println("There is no second largest element.");
            } else {
                System.out.println("The second largest number is: " + secondLargest);
            }
        }
    }
}