package org.example.project1;

public class Q6Project1 {
    public static void main(String[] args) {
        int number =11;
        boolean isPrime = true;

        if (number<=1){
            isPrime =false;
        }else {
            for (int i =2; i<=number / 2;i++){
                if (number % i ==0){
                    isPrime = false;
                    break;
                }
            }

        }
        System.out.println("is prime: " + isPrime);


    }
}
