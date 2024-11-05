package org.example;

//4. Create a 2D array of integers. Develop a program that will calculate
//the sum of even and odd numbers for that array.

public class Ex4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {7, 15, 8, 23},
                {5, 46, 88, 12},
                {9, 4, 44, 51},
        };
        int evenSum = 0;
        int oddSum = 0;

        for(int numb[]:numbers){
            for(int n:numb){
                if(n%2==0){
                    evenSum+=n;
                } else if(n%2!=0){
                    oddSum+=n;
                }
            }
        }
        System.out.print("sum of even numbers: "+evenSum);
        System.out.println();
        System.out.print("sum of odd numbers: "+oddSum);
    }
}
