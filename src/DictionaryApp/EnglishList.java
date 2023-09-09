package DictionaryApp;

public class EnglishList {
    private int wordCount;
    private Word head;
    private Word tail;

    public EnglishList(String word, String articleInGerman, String meaningAsTR,
                       String meaningAsGER, String usageInSentence) {
        wordCount = 1;
        Word newWord = new Word(word, articleInGerman, meaningAsTR, meaningAsGER,
                usageInSentence);
        head = newWord;
        tail =  newWord;
    }

    //todo add methodu için parametreleri scanner'dan dolduran bir method daha yap ve newWord'ün parametrelerini doldur
    public boolean add(String word, String articleInGerman, String meaningAsTR,
                       String meaningAsGER, String usageInSentence) {
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
}
