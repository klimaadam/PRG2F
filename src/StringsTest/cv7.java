package StringsTest;

import java.util.Scanner;

public class cv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Name";
        System.out.println("Zadej typ souboru: ");
        String typSouboru = sc.nextLine();
        System.out.println(name+"."+typSouboru);
    }
}
