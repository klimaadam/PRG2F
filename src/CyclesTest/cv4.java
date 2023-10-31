package CyclesTest;


public class cv4 {
    public static void main(String[] args) {
        int pocet = 0;
        for (int i = 0; i < 100000; i++) {
            int random = (int) (Math.random() * 100 + 1);
            System.out.println(random);
            if (random == 42){
                pocet = pocet + 1;
            }
        }
        System.out.println("Číslo 42 padlo: "+pocet+"x");
    }
}
