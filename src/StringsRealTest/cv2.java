package StringsRealTest;

public class cv2 {
    public static void main(String[] args) {
        String[] names = {"El Camino","La Bomba","Elephant","Lancelot"};

        for (int i = 0; i < names.length; i++) {

            if (names[i].contains("El ") || names[i].contains("La ")){
                System.out.println(names[i]);
                }
            }
        }
    }

