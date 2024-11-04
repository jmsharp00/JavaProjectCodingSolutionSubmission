import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        //Emir A.
        // Write a Java program to check whether a given number is prime or not.

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int numbers = myScanner.nextInt();
        if (numbers < 2) {
            System.out.println("Your number is not a prime number.");
        } else {
            for (int i = 2; i <= numbers / 2; i++) {
                if (numbers % i == 0) {
                    System.out.println("Your number is not a prime number.");
                    return;
                }


            }
            System.out.println("Your number is prime number");
        }


    }
}
