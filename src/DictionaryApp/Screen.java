package DictionaryApp;

import java.util.Scanner;

public class Screen {
    Scanner scanner = new Scanner(System.in);
    private Dictionary dictionary = new Dictionary();
    private int screenSelectNo = 0; // 1-Kelime eklemek, 2-Kelime incelemek(Çalışmak)[sortlara göre 1-2-3-4 // 4-3-2-1 // en az bilinenden en fazla bilinene doğru], 3-Kelime revize etmek (silmek ya da farklı bi anlam daha eklemek)

    private void selection() {
        String userEnter = null;
        boolean wrongChoice = true;
        while (wrongChoice) {
            System.out.println("Please select what do you want \n");
            System.out.println("1) Add New Word \n");
            System.out.println("2) Practice Words (You can choose algorithm after this selection \n)");
            System.out.println("3) Review Word (You can delete a word or you can add new meaning of already existing word) \n");
            try {
                userEnter = scanner.nextLine();
                screenSelectNo = Integer.parseInt(userEnter);
                if (screenSelectNo > 0 && screenSelectNo < 4) {
                    wrongChoice = false;
                }
            } catch (Exception exception) {
                System.out.println("You have chosen invalid selection!\n");
            }
        }
    }
    private void screenDirecting() {
        switch (screenSelectNo) {
            case 1->{
                dictionary.
            }
        }
    }

}
