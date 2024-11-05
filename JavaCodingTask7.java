public class JavaCodingTask7 {
    public static void main(String[] args) {
        // Number 7: Write a java program to print the first 10 numbers of the fibonacci series.

        int n = 10;
        int first = 0, second =1;

        System.out.println("First 10 fibonacci numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
