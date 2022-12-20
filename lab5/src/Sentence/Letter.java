package Sentence;

public class Letter {
    private final char symbol;

    Letter(char symbol) {
        this.symbol = symbol;
    }

    public boolean isVowel() {
        return symbol == 'e' ||
                symbol == 'y' ||
                symbol == 'i' ||
                symbol == 'o' ||
                symbol == 'a' ||
                symbol == 'u';
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
