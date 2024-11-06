package JavaCodingProject;

public class Task7 {
    public static void main(String[] args) {

        int x=10;
        int num1=0;
        int num2=1;

        for (int i = 0; i <x; i++) {
            System.out.print(num1 + " ");

            int nextnum = num1 + num2;

            num1 = num2;

            num2 = nextnum;

        }
    }
}