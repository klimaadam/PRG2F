package StringsTest;

public class cv5 {
    public static void main(String[] args) {
        String[] names = {"Jan", "Karel", "František Dlouhojmenný", "Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Sanơsima Trinidad Ruiz y Picasso", "Eva"};
        int delka = 0;
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > names[delka].length()){
                delka = i;
            }
        }
        System.out.println(names[delka]);
    }
}
