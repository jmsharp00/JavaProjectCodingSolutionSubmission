public class Question1 {
    public static void main(String[] args) {

    //1. Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.

        int [] temperatures = {75, 85, 53, 63, 79, 60, 70};

        int maxTemp = temperatures[0];
        int minTemp = temperatures[0];


        for (int temp : temperatures){
            if(temp > maxTemp){
                maxTemp = temp;}

            if(temp < minTemp){
                minTemp = temp;
            }
        }
        System.out.println("High temp of the week: " + maxTemp);
        System.out.println("Low temp of the week: " + minTemp);

    }
}
