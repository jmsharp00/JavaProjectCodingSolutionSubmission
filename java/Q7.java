public class Q7 {
    public static void main(String[] args) {

        //Emir A.
        // Write a Java Program to print the first 10 numbers of the Fibonacci series

        int until=10;
        int num1=0;
        int num2=1;

        System.out.print("First 10 numbers of the Fibonacci series: ");


        for (int i=0; i<until; i++){
            System.out.print(num1+ " ");
            int nextnum=num1+num2;
            num1=num2;
            num2 = nextnum;
        }












    }
}
