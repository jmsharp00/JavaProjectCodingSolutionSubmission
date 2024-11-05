package org.example.CodingTasks;

public class Q1Task {
    public static void main(String[] args) {
        //1. Create a program that uses an array to store a list of temperatures for a week,
        //and then uses a loop to find the highest and lowest temperature for the week.
        double[] temperatures = {72.3, 68.0, 72.5, 61.2, 74.8, 60.0, 71.1};

        double highest = temperatures[0];
        double lowest = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }

        System.out.println("Highest temperature for the week: " + highest);
        System.out.println("Lowest temperature for the week: " + lowest);
    }
}

// notes:
// create two placeholders, store the first number from the array
// assume these numbers to be the largest and the smallest numbers
// go over all of the numbers compare them with the initial numbers
// and if we see something even larger or smaller update the value

