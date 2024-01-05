package StringsRealTest;

import java.util.Scanner;

public class cv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš tel. číslo: ");
        String userName = sc.nextLine();

        for (int i = 0; i < userName.length(); i++) {
            if (userName.contains("+")) {
                System.out.println("Obsahuje +");
                break;
            } else {
                System.out.println("Neobsahuje +");
                break;
            }
        }
        for (int i = 0; i < userName.length(); i++) {
            if (userName.contains("420")) {
                System.out.println("Obsahuje 420");
                break;
            } else {
                System.out.println("Neobsahuje 420");
                break;
            }
        }
        for (int i = 0; i < userName.length(); i++) {
            if (userName.length() == 13){
                System.out.println("Ano, tel. č. obsahuje 9 čísel");
                break;
            } else {
                System.out.println("Neobsahuje 9 čísel");
                break;
            }
        }
    }
}
