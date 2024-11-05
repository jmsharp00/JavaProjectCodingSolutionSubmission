public class p1 {

    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.

        int [] temps = {90, 85, 70, 65, 110, 98, 120};

        int max = temps[0];
        int min = temps[0];

        for (int i = 0; i < temps.length; i++) {

            if (max <= temps[i]) {
                max = temps[i];
            }
            if (min >= temps[i]) {
                min = temps[i];
            }
        }
        System.out.println("The highest temperature is: " + max);
        System.out.println("The lowest temperature is: " + min);

    }
}
