package JavaCodingProject;

public class Task2 {
    public static void main(String[] args){

        int[] numbers = {4, 16, 23, 32, 19, 50, 9};

        int sum=0;

        for(int n : numbers) {
            sum += n;
        }
        System.out.println("The sum of stored elements is: " + sum);
    }
}
