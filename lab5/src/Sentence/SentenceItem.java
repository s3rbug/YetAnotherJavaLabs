package Sentence;

abstract public class SentenceItem implements Comparable<SentenceItem> {
    @Override
    public int compareTo(SentenceItem sentenceItem) {
        Word w1 = (Word) this;
        Word w2 = (Word) sentenceItem;
        if (w1.length() < 2 && w2.length() < 2) {   //  check if we are able to compare by second element
            return Character.compare(w1.getSymbol(0), w2.getSymbol(0));
        } else if (w1.length() < 2) {
            return 1;
        } else if (w2.length() < 2) {
            return -1;
        }
        if (w1.startsWithVowel() && w2.startsWithVowel()) {
            if (w1.getSymbol(1) == w2.getSymbol(1)) {
                return w1.compareTo(w2);
            }
            return Character.compare(w1.getSymbol(1), w2.getSymbol(1));
        } else if (w1.startsWithVowel()) {
            return -1;
        } else if (w2.startsWithVowel()) {
            return 1;
        }
        return w1.compareTo(w2);
    }
}
