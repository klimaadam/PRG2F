package StringsTest;

public class cv1 {
    public static void main(String[] args) {
        String[] names = {"Adam Klíma","Venca Matoušek", "Jana Nová", "Pepa Omáčka", "Jan Boháč", "Jan Fehér"};

        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Pepa Omáčka")) {
                System.out.println(names[i]);
            }
        }
    }
}

