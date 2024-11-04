package org.example;

public class CodingTask1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of
        //temperatures for a week, and then uses a loop to find
        //the highest and lowest temperature for the week.

        int [] temps={42, 15, 20, 41, 35, 12, 27};

        int max=temps[0];
        int min=temps[0];

for(int tem:temps) {
    if ( tem> max) {
        max=tem;
    }
    if (tem < min) {
        min=tem;
    }
}
    System.out.println("Highest temperature of the week: "+max+" ° C.");
    System.out.println("Lowest temperature of the week: "+min+" ° C.");

    }
}
