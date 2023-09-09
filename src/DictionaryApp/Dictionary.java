package DictionaryApp;

import java.util.Scanner;

public class Dictionary {
    Scanner mySc = new Scanner(System.in);
    private String word;
    private String articleInGerman;
    private String meaningAsTR;
    private String meaningAsGER;
    private String usageInSentence;
    private EnglishList englishList;

    private void getInfoFromUser() {
        System.out.println("Welcome ın this section you should enter the parameters as how can you want");
        System.out.println("**********************");
        System.out.println();
        boolean parametersCompleted = false;
        int parametersNo = 1;
        while (!parametersCompleted) {
            switch (parametersNo) {
                case 1:
                    System.out.println("please enter the word that you want to add: ");
                    try {
                        word = mySc.nextLine();
                        parametersNo++;
                    } catch (Exception exception) {
                        System.out.println("You have entered invalid string!");
                    }
                case 2:
                    System.out.println("please enter the articleInGerman that yours word : ");
                    try {
                        articleInGerman = mySc.nextLine();
                        parametersNo++;
                    } catch (Exception exception) {
                        System.out.println("You have entered invalid string!");
                    }
                case 3:
                    System.out.println("please enter the meaning as turkish that yours word: ");
                    try {
                        meaningAsTR = mySc.nextLine();
                        parametersNo++;
                    } catch (Exception exception) {
                        System.out.println("You have entered invalid string!");
                    }
                case 4:
                    System.out.println("please enter the meaning as deutsch that yours word: ");
                    try {
                        meaningAsGER = mySc.nextLine();
                        parametersNo++;
                    } catch (Exception exception) {
                        System.out.println("You have entered invalid string!");
                    }
                case 5:
                    System.out.println("please enter the usageInSentence as english that yours word: ");
                    try {
                        usageInSentence = mySc.nextLine();
                        parametersNo++;
                        parametersCompleted = true;
                    } catch (Exception exception) {
                        System.out.println("You have entered invalid string!");
                    }
            }
        }
    }

    public Dictionary() {
        getInfoFromUser(); // todo duruma göre bu method cagrılcak durumu da Screen clasında belirliyecez!
        englishList = new EnglishList(word, articleInGerman, meaningAsTR, meaningAsGER, usageInSentence);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getArticleInGerman() {
        return articleInGerman;
    }

    public void setArticleInGerman(String articleInGerman) {
        this.articleInGerman = articleInGerman;
    }

    public String getMeaningAsTR() {
        return meaningAsTR;
    }

    public void setMeaningAsTR(String meaningAsTR) {
        this.meaningAsTR = meaningAsTR;
    }

    public String getMeaningAsGER() {
        return meaningAsGER;
    }

    public void setMeaningAsGER(String meaningAsGER) {
        this.meaningAsGER = meaningAsGER;
    }

    public String getUsageInSentence() {
        return usageInSentence;
    }

    public void setUsageInSentence(String usageInSentence) {
        this.usageInSentence = usageInSentence;
    }

    public EnglishList getEnglishList() {
        return englishList;
    }

    public void setEnglishList(EnglishList englishList) {
        this.englishList = englishList;
    }
}
