public class Question9 {
    public static void main(String[] args) {
        //9. Write a program to print out duplicate elements from an Array of Strings

        String [] Pets ={"Cat", "Dog", "Fish", "Bird","Cat"};

        for(int i = 0; i< Pets.length; i++){
            for(int j = i+1; j< Pets.length; j++){
                if (Pets[i].equals(Pets[j])) {
                    System.out.println(Pets[i]);
                    break;
                }

            }
        }
    }
}
