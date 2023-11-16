package DictionaryApp;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        Dictionary dictionary = new Dictionary();
        Screen screen = new Screen(dictionary);

        screen.mainScreen();

         */

        int no1 = 0;
        int no2 = 0;

        Random random = new Random();
        no1 = random.nextInt(6)+1;
        do {
           no2 = random.nextInt(6) + 1;
        } while (no2 == no1);


        System.out.println(no1);
        System.out.println(no2);

    }
    public static void generateTwoDifferentNo(int no1, int no2) {
        Random random = new Random();
        no1 = random.nextInt(6)+1;
        while (no2 == no1) {
            no2 = random.nextInt(6) + 1;
        }
    }
}
