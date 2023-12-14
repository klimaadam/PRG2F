package StringsTest;

import java.util.Scanner;

public class cv1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String[] users = {"David","Michal","Honza","Pepa"};

        for (int i = 0; i < users.length; i++) {
            if (userName.equals(users[i])){
                System.out.println("Shoda!");
                break;
            } else {
                System.out.println("Not found!");
                break;
            }
        }
    }
}
