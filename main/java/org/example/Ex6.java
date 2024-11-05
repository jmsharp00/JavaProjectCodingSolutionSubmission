package org.example;


import java.util.Scanner;

// Write a Java program to check whether a given number is prime or not.
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's prime: ");

        int number = scanner.nextInt();
        boolean isPrime = true;

        if(number<=1){
            isPrime=false;
        } else{
            for(int i = 2; i<=number; i++){
                if(number%i ==0){
                    isPrime=false;
                    break;
                }
            }
        }
if(isPrime){
    System.out.println(number + " is Prime");
} else {
    System.out.println(number + " is not Prime");
}
scanner.close();

    }}
