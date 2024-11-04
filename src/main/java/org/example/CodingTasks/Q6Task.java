package org.example.CodingTasks;

public class Q6Task {
    public static void main(String[] args) {
        //6. Write a Java program to check whether a given number is prime or not.
        int number = 29;
        boolean isPrime = true;


        if (number <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i < number/2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        }
    }
}

// prime # is a # that is divisable by 1 or itself