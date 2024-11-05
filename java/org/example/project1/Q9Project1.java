package org.example.project1;

public class Q9Project1 {
    public static void main(String[] args) {

        String[] games ={"Elden Ring", "Baldur's Gate 3", "RDR2","The Witcher 3", "Elden Ring", "RDR2"};

        System.out.println("Duplicate games: ");

        for (int i=0; i < games.length; i++) {
            for (int j = i + 1; j < games.length; j++) {
                if (games[i].equals(games[j])) {
                    System.out.println(games[i]);
                    break;
                }
            }

        }
        }
    }
