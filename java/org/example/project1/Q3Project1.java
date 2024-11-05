package org.example.project1;

public class Q3Project1 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        for (int[] row: numbers){
            for (int num: row){
                if (num % 2==0){
                    System.out.println(num);
                }
            }

        }

        }

        }
