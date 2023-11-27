package KDVHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double kdvsizFiyat, kdvliFiyat, kdvOrani, kdvTutari;
        kdvOrani = 18;

        System.out.println("Merhaba, lütfen ürünün KDV'siz fiyatını yazınız: ");

        Scanner input = new Scanner(System.in);
        kdvsizFiyat = input.nextDouble();

        if (0 <= kdvsizFiyat && kdvsizFiyat <= 1000) {
            kdvOrani = 20;
        } else if (kdvsizFiyat > 1000) {
            kdvOrani = 8;
        }

        kdvTutari = (kdvsizFiyat*kdvOrani)/100;
        kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat = " + kdvsizFiyat + "TL\n");
        System.out.println("KDV Oranı = %" + kdvOrani);
        System.out.println("KDV Tutarı = " + kdvTutari + "TL\n");
        System.out.println("KDV'li Fiyat = " + kdvliFiyat + "TL");
    }
}
