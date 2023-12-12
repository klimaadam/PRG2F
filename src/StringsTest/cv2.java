package StringsTest;

import java.util.Scanner;

public class cv2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš libovolný text: ");
        String word = sc.nextLine();
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i) == word.charAt(i+1)){
                System.out.println("Ano, jsou zde zdovjená písmena");
                break;
                }
            }
        }
    }

