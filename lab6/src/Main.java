/*
 * ІО-01 Бугайчук Сергій
 * Лабораторна робота №6
 * Варіант - 10
 * С13 - 10 => визначити ієрархію тарифів мобільної компанії. Створити список тарифів компанії. Порахувати загальну чисельність клієнтів. Провести сортування тарифів на основі розміру абонентської плати. Знайти тариф у компанії, що відповідає заданому діапазону вартості послуг.
*/

import Rate.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rate[] rates = new Rate[]{
                new RateForBusiness("Rate for business", 20000, 500, 120000, "Samsung"),
                new RateForHome("Rate for home", 1500, 100, 70000, 5),
                new RateForRouters("Rate for routers", 3000, 150, 200000),
                new RateForTablets("Rate for tablets", 700, 50, 500000),
        };
        int totalCountClients = 0;
        for(Rate rate: rates){
            totalCountClients += rate.getCountClients();
        }
        System.out.println("Total count of clients: " + totalCountClients + "\n");
        System.out.println("Default rates order:");
        Rate.printAllRates(rates);
        System.out.println("Sorted by price:");
        Arrays.sort(rates, Comparator.comparing(Rate::getPrice));
        Rate.printAllRates(rates);

        System.out.print("Enter minimum rate price: ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum rate price: ");
        int max = scanner.nextInt();
        System.out.println("\tRates in found range: ");
        for(Rate rate: rates){
            if(rate.getPrice() >= min && rate.getPrice() <= max){
                System.out.println(rate);
            }
        }
    }
}