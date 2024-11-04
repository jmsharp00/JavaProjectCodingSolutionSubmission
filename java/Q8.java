public class Q8 {
    public static void main(String[] args) {

        //Emir A.
        // Maximum and minimum number in the array?

        int[] numbers = {12, 45, 86, 95, 75, 41, 110, 1123};
        int max = numbers[0];
        int min = numbers[0];

        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }

        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);


    }
}
