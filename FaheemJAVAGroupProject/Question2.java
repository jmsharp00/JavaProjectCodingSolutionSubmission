public class Question2 {
    public static void main(String[] args) {

        //2. Create an array of integer values. After the array is created, calculate
        // the sum of all stored elements in that array.

        int [] values = {5, 21, 7, 6, 15};

        int sum = 0;

        for(int num : values){

            sum += num;
        }
        System.out.println("The sum of all stored elements in the array is: " + sum);

    }
}
