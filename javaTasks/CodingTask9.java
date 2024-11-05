package org.example;

public class CodingTask9 {
    public static void main(String[] args) {
//Write a program to print out duplicate elements from an Array of Strings.
 String [] countries={"USA", "Mexico", "Canada", "Brazil","USA"};

 for(int i=0; i< countries.length; i++){
     for(int j=i+1; j<countries.length; j++){
         if (countries[i].equals(countries[j])) {
             System.out.println(countries[i]);
             break;
         }

     }
 }
    }
}
