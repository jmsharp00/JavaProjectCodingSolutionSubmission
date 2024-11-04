public class Q1 {
    public static void main(String[] args) {

        //Emir A.
        // Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.

        int[] temp = {75, 95, 85, 100, 88, 98, 99};
        int max = temp[0];
        int min = temp[0];

        for (int t : temp) {
            if (t > max) {
                max = t;


            }

            if (t < min) {
                min = t;

            }


        }
        System.out.println("Maximum temp is "+max);
        System.out.println("Minimum temp is "+min);
    }
}
