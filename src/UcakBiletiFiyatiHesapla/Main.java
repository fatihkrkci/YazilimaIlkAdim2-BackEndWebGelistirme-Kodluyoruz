package UcakBiletiFiyatiHesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double km, BiletTutari = 0, cocukBiletIndirimi = 0.5, gencBiletIndirimi = 0.1, yasliBiletIndirimi = 0.3;
        int yas;
        String yolculukTipi;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Gideceğiniz KM'yi giriniz : ");
            km = input.nextDouble();
            if (km <= 0)
                System.out.println("Hatalı Veri Girdiniz, Tekrar Deneyin!");
        }
        while(km <= 0);

        do{
            System.out.print("Yaşınızı Giriniz : ");
            yas = input.nextInt();
            if (yas <= 0)
                System.out.println("Hatalı Veri Girdiniz, Tekrar Deneyin!");
        }
        while(yas <= 0);

        do{
            System.out.print("Yolculuk Tipinizi Belirtiniz (Tek Yön için '1', Gidiş-Dönüş için '2' Tuşlayınız) : ");
            yolculukTipi = input.next();
            if (!yolculukTipi.equals("1") && !yolculukTipi.equals("2"))
                System.out.println("Hatalı Veri Girdiniz, Tekrar Deneyin!");
        }
        while(!yolculukTipi.equals("1") && !yolculukTipi.equals("2"));

        if (yolculukTipi.equals("1")) {
            BiletTutari = km*0.10;
        } else if (yolculukTipi.equals("2")) {
            BiletTutari = ((km*0.10)*0.8)*2;
        }


        if (yas <= 12) {
            BiletTutari -=  (BiletTutari * cocukBiletIndirimi);
        } else if ( yas <= 24 && yas > 12) {
            BiletTutari -= (BiletTutari * gencBiletIndirimi);
        } else if (yas >= 65) {
            BiletTutari -= (BiletTutari * yasliBiletIndirimi);
        }

        System.out.println("Bilet Tutarı : " + BiletTutari + "TL");
    }
}
