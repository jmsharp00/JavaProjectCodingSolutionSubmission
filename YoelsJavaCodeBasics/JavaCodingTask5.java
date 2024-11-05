public class JavaCodingTask5 {
    public static void main(String[] args) {
        //question 5: Write a program to swap 2 numbers without a temporary variable.
        int a=4;
        int b=9;

        System.out.println("Before swapping: a = "+a+" and b = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = "+a+" and b = "+b);

    }
}
