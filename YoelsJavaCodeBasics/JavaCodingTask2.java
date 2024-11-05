public class JavaCodingTask2 {
    public static void main(String[] args){

        int[] numbers = {5, 8, 24, 44, 45, 11, 7};
        int sum=0;

        for(int Y : numbers) {
            sum += Y;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
