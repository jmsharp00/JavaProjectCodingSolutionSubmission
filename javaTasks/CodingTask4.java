package org.example;

public class CodingTask4 {
    public static void main(String[] args) {
//Create a 2D array of integers. Develop a program that
// will calculate the sum of even and odd numbers separately for that array.
 int [][]numbers={
                {5,8,10,40,32},
                {10,20,25,30,35},
                {1,3,5,6,7,400}
        };
 int evenSum=0;
 int oddSum=0;

 for(int [] row:numbers){
    for(int n:row){
        if(n%2==0){
           evenSum+=n;
        }
        else{
            oddSum+=n;
        }
    }
 }
        System.out.println("Even sum is "+evenSum);
        System.out.println("Odd sum is "+oddSum);
    }
}
