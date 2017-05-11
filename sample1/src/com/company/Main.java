package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int day, price;
        int dayMax = 0;
        int dayMin = 0;
        int maxPrice = 0;
        int minPrice = 999;

        Scanner sc = new Scanner(System.in);
        System.out.print("日付を入力");
        day = sc.nextInt();
        while(day == 99){
            System.out.print("価格を入力");
            price = sc.nextInt();
            if(maxPrice <= price){
                dayMax = day;
                maxPrice = price;
            }
            if(minPrice >= price){
                dayMin = day;
                minPrice = price;
            }
            System.out.print("日付を入力");
            day = sc.nextInt();
        }
        System.out.println("(最高値)" + dayMax + "日 " + maxPrice + "円");
        System.out.println("(最低値)" + dayMin + "日 " + minPrice + "円");
        sc.close();
    }
}
