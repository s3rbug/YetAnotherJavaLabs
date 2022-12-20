/*
 * ІО-01 Бугайчук Сергій
 * Лабораторна робота №5
 * Варіант - 10
 * С3 - 1 => тип текствових змінних StringBuffer
 * С17 - 7 => відсортувати слова заданого тексту, що починаються з голосних літер, за другою літерою
 */

import Sentence.Sentence;

public class Main {
    public static void main(String[] args) {
        String baseString = "uaz u zac xac aab aaa a k aaz acy abx";
        StringBuffer stringBuffer = new StringBuffer(baseString);
        Sentence sentence = new Sentence(stringBuffer.toString());
        System.out.println(sentence);
        sentence.sort();
        System.out.println(sentence);
    }
}
