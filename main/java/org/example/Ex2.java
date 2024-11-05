package org.example;

public class Ex2 {
    public static void main(String[] args) {
        int[] numbers = {7, 89, 105, 88};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
