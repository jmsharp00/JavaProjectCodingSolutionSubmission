public class JavaCodingTask9 {
    public static void main(String[] args){
        // number 9: Write a java program to find the second-largest number in the array.

        int [] numbers={4, 19, 23, 95, 44, 71, 85};
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second largest number: " + second );

    }
}
