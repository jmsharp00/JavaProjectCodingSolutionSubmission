package org.example.CodingTasks;

public class Q2Task {
    public static void main(String[] args) {
        //2. Create an array of integer values. After the array is created,
        //calculate the sum of all stored elements in that array.
        int[] matrix={29,34,42,95,90,18};

        int sum=0;

        for(int i=0; i<matrix.length; i++){
            sum=sum+matrix[i];
        }
        System.out.println("The sum of the matrix is: "+sum);
    }
}
//check
//0<6 true, execute
//sum=0+29=29
// go back to condition, i=1, 1<6 true, execute
//sum=29, 29+34=63
// . . .
