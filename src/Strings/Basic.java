package Strings;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        char letter = 'A';
        char num = '5';
        char specials = '*';
        char special = '\n'; //odřádkování
        char tab = '\t'; //tabulátor
        System.out.println("Hello" + special + "World!");

        String greet = "Hello World!";
        System.out.println(greet);

        System.out.println("Délka je " + greet.length() + " znaků.");
        System.out.println("Na pozici 3 je písmeno " + greet.charAt(3));
        String addition = " It's friday!";
        System.out.println(greet + addition);
        String fullGreet = greet + addition;
        System.out.println(fullGreet); //spojí rovnou dohromady

        //Porovnávání! - takhle ne!
        if (fullGreet == (greet + addition)){
            System.out.println("They're same");
        } else {
            System.out.println("They're not same");
        }

        //Porovnávání! - takhle ano!
        if (fullGreet.equals(greet+addition)){
            //bezmi fullGreat  a porovnej to s tím, co ti hodím do závorek
            System.out.println("They're same");
        } else {
            System.out.println("They're not same");
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Zadal jsi " + input);

        //do nové proměnné
        //String inputUpper = input.toUpperCase();
        //System.out.println("Zadal jsi (velkými písmeny): " + inputUpper);

        //změnit
        input = input.toUpperCase();
        System.out.println("Po změně: " + input);
        String output = "";

        String word = "Hello";
        if (word.contains("el")){
            System.out.println("Obsahuje 'el' ");
            int indexE = word.indexOf('e');
            if (indexE >= 0){
                System.out.println("'e' se nachází na indexu " +indexE);
            }
        }


        System.out.println("'ll' je na indexu: " + word.indexOf("ll"));
    }
}
