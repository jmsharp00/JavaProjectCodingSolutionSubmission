public class p9 {

    public static void main(String[] args) {

        //Write a program to print out duplicate elements from an Array of Strings.

        String[] array = {"Alex", "alex", "Andrei", "andrei", "Larry", "larry", "Charlie", "charlie", "Dushka", "dushka", "Magic", "magic", "Houseplants", "houseplants"};


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equalsIgnoreCase(array[j])) {
                    System.out.println(array[i] + " and " + array[j] + " are duplicates.");
                    break;
                }

            }
        }
    }
}
