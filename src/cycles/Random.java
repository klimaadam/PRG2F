package cycles;

public class Random {

    public static void main(String[] args) {
        //kolik pokusů trvá, než padnout 2 stejné čísla, když jsou náhodná
        //a když jsou od 0 - 20
        int num1 = (int)(Math.random()*21);
        int num2 = (int)(Math.random()*21);
        int tries = 1;
        System.out.println(num1 + " , " + num2);
        while (num1 != num2){
            num1 = (int)(Math.random()*21);
            num2 = (int)(Math.random()*21);
            tries++;//tries = tries + 1
            System.out.println(num1 + " , " + num2);
        }
        System.out.println("Pokusů celkem:" + tries);

        //vygeneruj 100x 2 náhodná čísla, vypiš, kolikrát padlo stejné
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            num1 = (int)(Math.random()*21);
            num2 = (int)(Math.random()*21);
            System.out.println(num1 + " , " + num2);
            if (num2 == num1){
                counter++;//counter = counter + 1
            }
        }
        System.out.println("Stejné čísla padla: " + counter + "x");
    }
}
