package pole_2D_test;

import java.util.ArrayList;
public class cv4 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numList.add(i, (int) (Math.random()*101));
        }

        System.out.println("pole po vygenerování:");
        System.out.println(numList);
        System.out.println("------------------------------------------");

        ArrayList<Integer> numList2 = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) >= 50){
                numList2.add(numList.get(i));
            }
        }
        System.out.println("pole bez menších čísel než padesát: ");
        System.out.println(numList2);

        int delete = numList.size() - numList2.size();

        System.out.println("Bylo odstraněno "+delete+" prvků");




    }
}
