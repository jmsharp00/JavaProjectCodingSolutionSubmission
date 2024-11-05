package org.example;

//Write a program to print out duplicate elements from an Array of Strings.

public class Ex9 {
    public static void main(String[] args) {
        String[] words = {"Sean", "John", "John", "Mary"};

        String duplicate = " ";

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    break;
                }
            }


        }


    }
}

