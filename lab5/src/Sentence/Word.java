package Sentence;

import java.util.ArrayList;

public class Word extends SentenceItem {
    private final ArrayList<Letter> letters = new ArrayList<>();

    public Word(String word) {
        for (int i = 0; i < word.length(); ++i) {
            letters.add(new Letter(word.charAt(i)));
        }
    }

    public boolean startsWithVowel() {
        return this.get(0).isVowel();
    }

    public int length() {
        return letters.size();
    }

    public Letter get(int index) throws IndexOutOfBoundsException {
        return letters.get(index);
    }

    public char getSymbol(int index){
        return letters.get(index).getSymbol();
    }

    public int compareTo(Word w){
        return this.toString().compareTo(w.toString());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Letter letter : letters) {
            stringBuilder.append(letter.toString());
        }
        return stringBuilder.toString();
    }
}
