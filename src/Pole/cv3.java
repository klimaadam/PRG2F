package Pole;

import java.util.Arrays;

public class cv3 {
    public static void main(String[] args) {
        int[] binaryArray = {1,0,1,1,1,1,0,1};
        int result = 0;

        for (int i = 0; i < binaryArray.length; i++) {
            result += binaryArray[i] * (int) Math.pow(2,i);
        }
        System.out.println(result);
    }
}
