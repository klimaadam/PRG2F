package CyclesTest;

import java.util.Scanner;

public class cv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš číslo:");
        int num = sc.nextInt();
        int num2 = num;
        for (int i = 1; i < num; i++){
            num2 = num2 * (num-i);
        }
        System.out.println("Faktoriál čísla "+(num)+" je "+(num2));

        //n-tá mocnina

        //int num = sc.nextInt();
        //int num2 = 1;
        //for (int i = 0; i < num; i++){
        //    num2 = num2 * num;
        //}
        //System.out.println(num2);

    }
}
