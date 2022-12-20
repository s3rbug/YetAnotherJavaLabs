package Sentence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Sentence {
    private final ArrayList<SentenceItem> sentenceItems = new ArrayList<>();
    private boolean removedPunctuation = false;

    public Sentence(String str) {
        StringTokenizer st = new StringTokenizer(str.trim(), ",!:. ", true);
        while (st.hasMoreElements()) {
            String item = (String) st.nextElement();
            if (item.matches("^[,.;:?! ]$")) {
                sentenceItems.add(new Punctuation(item.charAt(0)));
            } else {
                sentenceItems.add(new Word(item));
            }
            System.out.println("item:" + item);
        }
    }

    public void sort() {
        removePunctuation();
        Collections.sort(sentenceItems);
    }

    public void removePunctuation(){
        sentenceItems.removeIf(item -> item.getClass() == Punctuation.class);
        removedPunctuation = true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (SentenceItem sentenceItem : sentenceItems) {
            stringBuilder.append(sentenceItem);
            if(removedPunctuation){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
