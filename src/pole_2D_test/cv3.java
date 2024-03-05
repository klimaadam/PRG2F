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

//Napište program, kde je připravený ArrayList pro řetězce španělských podstatných jmen.
//Uživatel bude zadávat řetězce, zadávání ukončí frází fin. Následně jsou do konzole vypsány
//všechny řetězce se španělským členem (tj. vše, co začíná na (el/la/un_*slovo*).

