package StringsTest;

public class cv6 {
    public static void main(String[] args) {
      String number = "987654321";
      String znak = "";
        for (int i = 0; i < number.length(); i++) {
            znak = number.charAt(i)+znak;
        }
        System.out.println(znak);
    }
}
