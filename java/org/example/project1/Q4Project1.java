package org.example.project1;

public class Q4Project1 {
    public static void main(String[] args) {

        int [][] numbers={
            {20,30,40,50},
            {55,60,70,83},
            {78,52,91,86}
        };
         int evenSum=0;
         int oddSum=0;
         for (int[] row:numbers){
             for (int n:row){
                 if (n%2==0){
                     evenSum=evenSum+n;
                 }else {
                     oddSum=oddSum+n;
                 }
             }
         }
        System.out.println("Sum of Even Number: " + evenSum);
        System.out.println("Sum of Odd Number: " + oddSum);


    }
}
