package JavaCodingProject;

public class Task9 {
    public static void main(String[] args) {

        String [] meals={"Pasta", "Steak", "Rice", "Eggs","Pasta"};

        for(int i=0; i< meals.length; i++){

            for(int x=i+1; x<meals.length; x++){

                if (meals[i].equals(meals[x])) {

                    System.out.println(meals[i]);
                    break;
                }

            }
        }
    }
}
