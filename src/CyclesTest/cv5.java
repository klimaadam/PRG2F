package CyclesTest;

import java.util.Scanner;

public class cv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadej číslo: ");
        int num = sc.nextInt();
        int num2 = 1;
        for (int i = 0; i < num; i++) { //řádek
            for (int j = num2; j < num+num2; j++) {  //číslo
                System.out.print(j+"\t");
            }
            System.out.println();
            num2 = num2 + num;
        }
    }
}
