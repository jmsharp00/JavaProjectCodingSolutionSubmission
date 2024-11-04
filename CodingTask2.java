package org.example;

public class CodingTask2 {
    public static void main(String[] args) {
       //Create an array of integer values. After the array is created
       // calculate the sum of all stored elements in that array.

       int [] elements={23, 3, 56, 72, 11, 180, 34};
       int sum=0;

       for(int e:elements){
           sum+=e;
       }
        System.out.println(sum);

    }
}
