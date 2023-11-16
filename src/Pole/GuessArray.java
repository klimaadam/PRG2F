package Pole;

import java.util.Arrays;
import java.util.Scanner;

public class GuessArray {
    public static void main(String[] args) {
        //vytvor pole o velikost 6
        //naplnit nahodnymi cislo 1 - 15
        //uzivatele se 7x zeptate, aby uhodl cislo v poli
        //u uzivatele se sleduje skore
        //pri spravnem tipu se pricte skore 100
        int[] guessArrey = new int[6];
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int guess;

        for (int i = 0; i < guessArrey.length; i++) {
            guessArrey[i] = (int)(Math.random()*15+1);
        }

        //cheat
        System.out.println(Arrays.toString(guessArrey));

        //Ptam se 7x
        for (int i = 0; i < 7; i++) {
            System.out.println("Tipni cislo");
            guess = sc.nextInt();

            if (guess < 0 || guess > 15){
                continue;
            }
            //Hledam, jestli cislo neni v poli
            for (int j = 0; j < guessArrey.length; j++) {
                if (guess == guessArrey[j]){
                    score += 100;
                    System.out.println("Uhadl jsi!");
                    guessArrey[j] = -1;
                    System.out.println(Arrays.toString(guessArrey));
                }
            }
            //uz uhodl vse
            if (score >= guessArrey.length * 100){
                break;
            }
        }
        System.out.println("Game over, score: " + score);

    }
}