package DictionaryApp;

import java.util.Scanner;

public class EnglishList {
    Scanner mySc = new Scanner(System.in);
    private int wordCount;
    private Word head;
    private Word tail;
    private String word;
    private String articleInGerman;
    private String meaningAsTR;
    private String meaningAsGER;
    private String usageInSentence;
    private Word currentWord;

    public EnglishList(String word, String articleInGerman, String meaningAsTR,
                       String meaningAsGER, String usageInSentence) {
        wordCount = 1;
        Word newWord = new Word(word, articleInGerman, meaningAsTR, meaningAsGER,
                usageInSentence);
        head = newWord;
        tail =  newWord;
        currentWord = head;
    }
    private void getInfoFromUser() {
        System.out.println("Welcome, ın this section you should enter the parameters as how can you want");
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
    public boolean moveCurrentWordNext() {
        if (currentWord.getNext() != null) {
            Word temp = currentWord;
            currentWord = currentWord.getNext();
            currentWord.setPrev(temp);
            return true;
        }
        return false;
    }

    //todo add methodu için parametreleri scanner'dan dolduran bir method daha yap ve newWord'ün parametrelerini doldur
    public boolean add() {
        getInfoFromUser();
        Word newWord = new Word(word, articleInGerman, meaningAsTR, meaningAsGER,
                usageInSentence);
        if (wordCount == 0) {
            tail = newWord;
            head = newWord;
            wordCount++;
            return true;
        }
        if (!contains(newWord)) {
            tail.setNext(newWord);
            newWord.setPrev(tail);
            tail = newWord;
            wordCount++;
            return true;
        }
        return false;
    }

    public boolean contains(Word newWord) {
        boolean isContains = false;
        Word currentWord = head;
        for (int i = 0;i<wordCount;i++) {
            if (newWord.getWord().equals(currentWord.getWord())) {
                isContains = true;
                return isContains;
            }
            currentWord = head.getNext();
        }
        return isContains;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public Word getHead() {
        return head;
    }

    public void setHead(Word head) {
        this.head = head;
    }

    public Word getTail() {
        return tail;
    }

    public void setTail(Word tail) {
        this.tail = tail;
    }
    //TODO algoritmalarla sort düzlemleri kurmak lazım kullanıcının kolaylığı için!

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

    public Word getCurrentWord() {
        return currentWord;
    }

    public void setCurrentWord(Word currentWord) {
        this.currentWord = currentWord;
    }
}
