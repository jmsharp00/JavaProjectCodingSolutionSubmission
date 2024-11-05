package org.example;

public class CodingTask3 {
    public static void main(String[] args) {
    //Create a 2D array or integer type where you will store odd and even numbers.
    // Develop a program that will identify/print the even numbers only.

    int [][]numbers={
            {5,8,10,40,32},
            {10,20,25,30,35},
            {1,3,5,6,7,400}
    };

    for(int[] row:numbers){
        for(int n:row){
           if(n%2==0){
               System.out.println(n);
           }
        }
    }
    }
}
