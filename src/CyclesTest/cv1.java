package CyclesTest;

import  java.util.Scanner;
public class cv1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš číslíčko:");
        int num = sc.nextInt();
        int num2 = 0;
        while (num != -1){
            num2 = num2 + num;
            num = sc.nextInt();
        }
        System.out.println("Celkový součet je: "+(num2));
    }
}
