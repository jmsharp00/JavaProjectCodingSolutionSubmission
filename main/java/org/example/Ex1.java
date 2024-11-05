package org.example;

/*1. Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.
*/
public class Ex1 {
    public static void main(String[] args) {
        int[] temps = {44, 17, -23, 99, 102, 60, 32};
        int highestTemp = 0;
        int lowestTemp = 0;

        for (int t : temps) {
            if (t > highestTemp) {
                highestTemp = t;
            } else if (t < lowestTemp) {
                lowestTemp = t;

            }
        }
        System.out.println("Highers temperature: " + highestTemp);
        System.out.println("Lowest temperature: " + lowestTemp);
    }

}

