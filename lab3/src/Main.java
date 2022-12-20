/*
 * ІО-01 Бугайчук Сергій
 * Лабораторна робота №3
 * Варіант - 10
 * С3 - 1 => тип текствових змінних StringBuffer
 * С17 - 7 => відсортувати слова заданого тексту, що починаються з голосних літер, за другою літерою
 * */

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static boolean startsWithVowel(String string) {
        return string.matches("^[eyuioa][a-zA-Z]*");
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("ab, aa az: ac aa ad ae ba bb bc bd bh bu a b z k i");
        String[] words = str.toString().split("[\s.,:;]+");

        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        Comparator<String> comparator = (String a, String b) -> {
            if(a.length() < 2 || b.length() < 2){
                return 0;
            }
            if (startsWithVowel(a) && startsWithVowel(b)) {
                return Character.compare(a.charAt(1), b.charAt(1));
            }
            else if(startsWithVowel(a)){
                return -1;
            }
            else if(startsWithVowel(b)){
                return 1;
            }
            return 0;
        };
        Arrays.sort(words, comparator);
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
