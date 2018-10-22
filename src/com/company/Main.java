package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner kbreader = new Scanner(System.in);

        String names[] = new String[50];
        names[0] = "Prem";
        names[1] = "Benito";
        names[2] = "Bryson";
        names[3] = "John";
        names[4] = "Jackson";
        names[5] = "Farquaad";
        names[6] = "Mary";
        names[7] = "Heather";
        names[8] = "Courtney";
        names[9] = "Jaquizz";
        names[10] = "Theodore";
        names[11] = "Elvie";
        names[12] = "Korey";
        names[13] = "Cassie";
        names[14] = "Normand";
        names[15] = "Tatiana";
        names[16] = "Jason";
        names[17] = "Li";
        names[18] = "Maura";
        names[19] = "Sushi";
        names[20] = "Malarkey";
        names[21] = "Lissette";
        names[22] = "Ashley";
        names[23] = "Douglas";
        names[24] = "Barbara";
        names[25] = "Peyton";
        names[26] = "Christina";
        names[27] = "Tina";
        names[28] = "Coy";
        names[29] = "Merlin";
        names[30] = "Harry";
        names[31] = "Hermione";
        names[32] = "Farha";
        names[33] = "Hermione";
        names[34] = "Rowley";
        names[35] = "Gregory";
        names[36] = "Luke";
        names[37] = "Leia";
        names[38] = "Belle";
        names[39] = "Steve";
        names[40] = "Sebastian";
        names[41] = "Ian";
        names[42] = "Drew";
        names[43] = "Dan";
        names[44] = "Stephanie";
        names[45] = "Valerie";
        names[46] = "Victor";
        names[47] = "Sam";
        names[48] = "Phillip";
        names[49] = "William";

        Arrays.sort(names);

        int guess = names.length;
        int a = 0;

        System.out.println("Please select a name from the following list, but don't tell me what it is!");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Do you have your name? Enter 0 for yes or 1 for no.");
        int ready = kbreader.nextInt();

        System.out.println("I am going to make my guesses.");
        System.out.println("If the first letter of the name I pick has to be closer to A, type 'up'.");
        System.out.println("If the first letter of the name I pick has to be closer to Z, type 'down'.");
        System.out.println("If I guess the name you picked, enter 'correct'.");

        System.out.println("Are you ready? Enter 0 for yes or 1 for no.");
        a = kbreader.next().length();

        guess = guess/2;
        System.out.println("Is your name: " + names[guess]);
        System.out.println("Up, down, or correct?");
        a = kbreader.next().length();

        while (a != 7) {

            if (a == 2) {
                guess = guess/2;
                System.out.println("Is your name: " + names[guess]);
                System.out.println("Up, down, or correct?");
                a = kbreader.next().length();
            }
            else if (a == 4) {
                guess = 24 + guess/2;
                System.out.println("Is your name: " + names[guess]);
                System.out.println("Up, down, or correct?");
                a = kbreader.next().length();
            }
        }

        System.out.println("Thanks for playing!");



    }
}
