public class p7 {

    public static void main(String[] args) {

        int n = 10;
        int num1 = 0;
        int num2 = 1;


        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");


            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}
