/*
 * ІО-01 Бугайчук Сергій
 * Лабораторна робота №2
 * Варіант - 10
 * С5 - 0 => дія з матрицею: C = a x B
 * С7 - 3 => тип елементів матриці int
 * C11 - 10 => дія з матрицею С: знайти середнє значення елементів матриці
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter matrix B row count: ");
        int n = scanner.nextInt();
        System.out.print("Enter matrix B column count: ");
        int m = scanner.nextInt();
        int[][] b = new int[n][m];
        int[][] c = new int[n][m];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                System.out.print("Enter b[" + i + "][" + j + "] = ");
                b[i][j] = scanner.nextInt();
                c[i][j] = b[i][j] * a;
            }
        }
        System.out.println("Matrix B:");
        for(int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println("Matrix C:");
        for(int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(c[i][j] + " ");
                sum += c[i][j];
            }
            System.out.println();
        }
        if(n * m == 0){
            System.out.println("Average matrix C element is 0");
        }
        else{
            System.out.println("Average matrix C element is " + sum / (n * m));
        }
    }
}
