public class p4 {

    public static void main(String[] args) {

        //Create a 2D array of integers.
        // Develop a program that will calculate the sum of even and odd numbers separately for that array.
        int [][] array1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int oddSum = 0;
        int evenSum = 0;

        for (int [] array : array1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i]%2 == 0) {
                    evenSum += array[i];
                } else {
                    oddSum += array[i];
                }
            }
        }

        System.out.println("The sum of all odd numbers is "+oddSum);
        System.out.println("The sum of all even numbers is "+evenSum);
    }
}
