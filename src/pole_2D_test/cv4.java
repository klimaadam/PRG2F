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

//Napište program, který vygeneruje 100x náhodná čísla 0 – 100 do ArrayListu. Po
//vygenerování z pole odstraňte všechny čísla menší než 50. Dále vypište to konzole, kolik čísel
//bylo odstraněno a obsah Listu po odstranění. Zamyslete se, jak by taková úloha vypadala,
//kdybyste místo ArrayListu použili obyčejné pole.