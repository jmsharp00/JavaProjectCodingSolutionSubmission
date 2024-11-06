package JavaCodingProject;

public class Task1 {
    public static void main(String[] args) {
        int[] temperatures = {78, 71, 65, 95, 83, 59, 87};

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
