public class JavaCodingTask1 {
    public static void main(String[] args) {
        int[] temperatures = {72, 79, 64, 95, 74, 59, 72};

        int max = temperatures[0];
        int min = temperatures[0];

        for (int temp : temperatures) {
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }

        System.out.println("Max temperature: " + max );
        System.out.println("Min temperature: " + min);
    }


}
