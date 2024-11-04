package org.example.CodingTasks;

import java.util.HashSet;

public class Q10Task {
    public static void main(String[] args) {
        //10. Write a program to print out duplicate elements from an Array of Strings.

        String[] names={"Appa","Jess","Jaime","Appa","Korea"};
        findDuplicates(names);
    }

    public static void findDuplicates(String[] array) {
        HashSet<String> uniqueElements = new HashSet<>();
        HashSet<String> duplicateElements = new HashSet<>();

        for (String element : array) {

            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }


        if (duplicateElements.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements: " + duplicateElements);
        }
    }
}
