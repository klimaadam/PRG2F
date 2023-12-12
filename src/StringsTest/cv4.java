package StringsTest;

public class cv4 {
    public static void main(String[] args) {
        String words = "Ahoj jak se máš kokote.";
        int slova = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ' || words.charAt(i) == '.'){
                slova += 1;
            }
        }
        System.out.println(slova);
    }
}
