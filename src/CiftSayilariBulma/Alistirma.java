package CiftSayilariBulma;

import java.util.Scanner;

public class Alistirma {
    public static void main(String[] args){
        int sayi;
        double toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin : ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if(i % 3 == 0 && i % 4 == 0){
                toplam += i;
            }
        }
        System.out.println("0'dan Girilen Değere Kadar Olan Sayılardan 3 ve 4'e Tam Bölünen Sayıların Toplamı : " + toplam);

    }
}
