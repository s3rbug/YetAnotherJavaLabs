/*
* ІО-01 Бугайчук Сергій
* Лабораторна робота №1
* Варіант - 10
* С2 - 0 => операція О1 +
* С5 - 0 => операція О2 *
* С7 - 3 => тип індексів long
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        long a = scanner.nextLong();
        System.out.print("Enter N: ");
        long n = scanner.nextLong();
        System.out.print("Enter B: ");
        long b = scanner.nextLong();
        System.out.print("Enter M: ");
        long m = scanner.nextLong();
        long s = 0;
        for(long i = a; i <= n; ++i){
            for(long j = b; j <= m; ++j){
                if(i + j == 0){
                    System.out.println("Dividing by zero");
                    return;
                }
                s += (i * j) / (i + j);
            }
        }
        System.out.println("S = " + s);
    }
}
