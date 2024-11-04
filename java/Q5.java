public class Q5 {
    public static void main(String[] args) {
        //Emir A.
        // Write a program to swap 2 numbers without a temporary variable.

        int [] num = {5, 10};

        num[0]=num[0]+num[1];
        num[1]=num[0]-num[1];
        num[0]=num[0]-num[1];

        System.out.print("After swapping new int [] num= ("+num[0]+","+num[1]+")");


    }
    }

