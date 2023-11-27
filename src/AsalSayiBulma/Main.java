package AsalSayiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " sayısı ASALDIR !");
        }
        else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
    }
}
