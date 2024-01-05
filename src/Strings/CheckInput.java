package Strings;

import javax.swing.*;
import java.util.Scanner;

public class CheckInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej IP adresu");
        String input = sc.nextLine();
        System.out.println("Zadal jsi:" + input);

        String[] parts = input.split("\\.");
        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts[i].length(); j++) {
                char current = parts[i].charAt(j);
                if (Character.isDigit(current)) {
                    System.out.println("Address does not contain a number");
                    break;
                }
            }

            if (parts.length == 4) {
                System.out.println("IP length OK");
            } else {
                System.out.println("Invalid length");
                break;
            }

            int addressParts = Integer.parseInt(parts[i]);
            if (addressParts >= 0 && addressParts <= 250) {
                System.out.println((i + 1) + "/" + parts.length + " OK");
            } else {
                System.out.println("Adress not OK");
                break;
            }
        }
    }
}
