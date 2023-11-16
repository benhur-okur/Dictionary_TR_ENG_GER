package DictionaryApp;

public class Word {
    private int correctGuess = 0;
    private String word;
    private String articleInGerman;
    private String meaningAsTR;
    private String meaningAsGER;
    private String usageInSentence;
    private Word next;
    private Word prev;

    public Word(String word, String articleInGerman, String meaningAsTR, String meaningAsGER, String usageInSentence) {
        this.word = word;
        this.articleInGerman = articleInGerman;
        this.meaningAsTR = meaningAsTR;
        this.meaningAsGER = meaningAsGER;
        this.usageInSentence = usageInSentence;
    }

    public int getCorrectGuess() {
        return correctGuess;
    }

    public void setCorrectGuess(int correctGuess) {
        this.correctGuess = correctGuess;
    }

    public Word getPrev() {
        return prev;
    }

    public void setPrev(Word prev) {
        this.prev = prev;
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

    public Word getNext() {
        return next;
    }

    public void setNext(Word next) {
        this.next = next;
    }

    public void showWordInfo() {
        System.out.printf("Word is -> %s \nArticle in german -> %s \nMeaning as TR -> %s\nMeaning as GER -> \nUsage in sentence -> %s \n",
                word, articleInGerman, meaningAsTR, meaningAsGER,usageInSentence);
    }
}
