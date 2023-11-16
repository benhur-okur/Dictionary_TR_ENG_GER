package DictionaryApp;

import java.util.Scanner;

public class Screen {
    Scanner scanner = new Scanner(System.in);
    private Dictionary dictionary;
    //private Word currentWord;
    private boolean isContinue;
    private int screenSelectNo = 0; // 1-Kelime eklemek, 2-Kelime incelemek(Çalışmak)[sortlara göre 1-2-3-4 // 4-3-2-1 // en az bilinenden en fazla bilinene doğru], 3-Kelime revize etmek (silmek ya da farklı bi anlam daha eklemek)

    public void mainScreen() {
        String userEnter;
        while (true) {
            System.out.println("Please select what do you want \n");
            System.out.println("0) See How Many Words you have saved already \n");
            System.out.println("1) Add New Word \n");
            System.out.println("2) Practice Words (You can choose algorithm after this selection) \n");
            System.out.println("3) Review Word (You can delete a word or you can add new meaning of already existing word) \n");
            System.out.println("4) Exit (Close App)\n");
            try {
                userEnter = scanner.nextLine();
                screenSelectNo = Integer.parseInt(userEnter);
                if (screenSelectNo >= 0 && screenSelectNo < 5) {
                    screenDirecting();
                }
            } catch (Exception exception) {
                System.out.println("You have chosen invalid selection!\n");
            }
        }
    }
    private void screenDirecting() {
        switch (screenSelectNo) {
            case 0-> System.out.println("Current Word Numbers That have been saved : " + dictionary.getEnglishList().getWordCount());
            case 1-> addApp();
            case 2-> practiceApp();
            case 3-> System.out.println("Daha yapılmadı");
            case 4-> {
                System.out.println("Quiting..");
                System.exit(0);
            }
        }
    }

    public int getScreenSelectNo() {
        return screenSelectNo;
    }

    public void setScreenSelectNo(int screenSelectNo) {
        this.screenSelectNo = screenSelectNo;
    }

    public void practiceApp() {
        isContinue = true;
        System.out.println("Welcome To The Practice Screen \n");
        while (isContinue) {
            if (backToMain()) {
                break;
            }
            if (guessedCorrectly()) {
                dictionary.getEnglishList().moveCurrentWordNext();
                System.out.println("Moving To The Next Word..");
            } else {
                System.out.println("You Are False");
            }
        }
    }
    public boolean guessedCorrectly() {
        System.out.println("Current Word Is : " + dictionary.getEnglishList().getCurrentWord().getWord() + "\n");
        boolean wrongEnter = true;
        String guess = null;
        while (wrongEnter) { // tahmini yaparken yanlış bir girdi girmemesi için olan loop
            System.out.println("Please Enter Your Guess");
            try {
                guess = scanner.nextLine();
                wrongEnter = false;
            } catch (Exception exception) {
                System.out.println("You Have Entered Invalid String!!");
            }
        }
        if (guess.equals(dictionary.getEnglishList().getCurrentWord().getWord())) {
            int correctGuess = dictionary.getEnglishList().getCurrentWord().getCorrectGuess();
            System.out.println("You guessed correctly and you can more ınfo about " + dictionary.getEnglishList().getCurrentWord().getWord());
            dictionary.getEnglishList().getCurrentWord().showWordInfo();
            dictionary.getEnglishList().getCurrentWord().setCorrectGuess(correctGuess+1);
            return true;
        }
        return false;
    }

    public Screen(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void addApp () {
        while (true) {
            if (backToMain()) {
                break;
            }
            if (dictionary.getEnglishList().add()) {
                System.out.println("Word has been saved");
            } else {
                System.out.println("Your word has been saved already, please try agian with another word");
            }
        }
    }

    private boolean backToMain () {
        System.out.println("If you want to go back to main screen please press 1");
        String stringEnter = null;
        int escapeNo;
        while (true) {
            System.out.println("1) Go To Main Screen (Exit This Section!)");
            System.out.println("2) Stay In This Section ");
            try {
                stringEnter = scanner.nextLine();
                escapeNo = Integer.parseInt(stringEnter);
                return escapeNo == 1;
            } catch (Exception exception) {
                System.out.println("You have entered invalid value!");
            }


        }
    } // its different from breakLoop we are doing this method with boolean return type


}
