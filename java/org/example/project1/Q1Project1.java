package org.example.project1;

public class Q1Project1 {
    public static void main(String[] args) {

        int[] temperatures = {22, 25, 19, 30, 28, 21, 26};
        int highest = temperatures[0];
        int lowest = temperatures[0];

        for (int temp : temperatures) {
            if (temp > highest) highest = temp;
            if (temp < lowest) lowest = temp;
        }

        System.out.println("Highest temperature: " + highest);
        System.out.println("Lowest temperature: " + lowest);

    }
}
