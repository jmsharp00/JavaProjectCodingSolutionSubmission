public class JavaCodingTask6 {
    public static void main(String[] args){
        // number 6: write a java program to check whether a given number is prime or not.
        int number = 44;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
