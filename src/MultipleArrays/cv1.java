package MultipleArrays;

import java.util.Scanner;

public class cv1 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j+i*matrix.length+1;
            }
        }

//        //spocitej prumer
//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//            }
//
//            System.out.println("Prumer " + (i+1) + ": " + ((double)(sum/matrix[i].length)));
//            sum = 0;
//        }
//

        //uzivatel zada hodnotu n, vypiste pouze n-ty radek:
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo radku:");
        int input = sc.nextInt();
        for (int i = 0; i < matrix[input].length; i++) {
            System.out.print(matrix[input][i] + " ");
        }
        System.out.println();

        System.out.println("PRINT: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
