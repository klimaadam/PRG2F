package pole_2D_test;

import java.util.ArrayList;
import java.util.Scanner;

public class cv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        System.out.println("Napiš espanol jména: ");
        String input = sc.nextLine();
        while (!input.equals("fin")){
            wordList.add(input);
            input = sc.nextLine();
        }

        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).startsWith("el ") || wordList.get(i).startsWith("la ") || wordList.get(i).startsWith("un ")){
                System.out.println(wordList.get(i));
            }
        }
    }
}

