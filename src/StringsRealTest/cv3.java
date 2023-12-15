package StringsRealTest;

public class cv3 {
    public static void main(String[] args) {
        String[] names = {"Adam Klíma","Jan Fehér"};
        String znaky = "";;
        for (int i = 0; i < names.length; i++) {
                if ((i+1) % 2 == 0){
                    char znak2 = names[i].charAt(i);
                    String znak3 = String.valueOf(znak2);
                    znak3 = znak3.toLowerCase();
                    znaky = znaky+znak3;
                } else {
                    char znak2 = names[i].charAt(i);
                    String znak3 = String.valueOf(znak2);
                    znak3 = znak3.toUpperCase();
                    znaky = znaky+znak3;
                }
            System.out.println(znaky);
        }
    }
}
