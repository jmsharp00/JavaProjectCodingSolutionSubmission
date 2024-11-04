public class Q10 {
    public static void main(String[] args) {



        //Emir A.
        // Write a program to print out duplicate elements from an Array of Strings

        String [] names= {"Marry","Joe","Phil","Marry","Rich","Ricky","Phil","Gloria" };
        System.out.println("Duplicate elements:");

        for(int i=0; i< names.length; i++){
            for(int j=i+1; j< names.length; j++){

                if (names[i].equals((names[j]))){
                    System.out.println(names[i]);
                    break;
            }
        }






    }
}}
