package VucutKitleEndeksiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double boy, kilo, vucutKitleIndeksi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();
        vucutKitleIndeksi = kilo / (boy * boy);

        if(vucutKitleIndeksi < 18)
        {
            System.out.println("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi + "\nVücut Tipiniz : ZAYIF");
        }
        else if(vucutKitleIndeksi >= 18 && vucutKitleIndeksi <25)
        {
            System.out.print("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi + "\nVücut Tipiniz : NORMAL");
        }
        else if(vucutKitleIndeksi >= 25 && vucutKitleIndeksi <30)
        {
            System.out.print("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi + "\nVücut Tipiniz : KİLOLU");
        }
        else if(vucutKitleIndeksi >= 30 && vucutKitleIndeksi <35)
        {
            System.out.print("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi + "\nVücut Tipiniz : OBEZ");
        }
        else
        {
            System.out.print("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi + "\nVücut Tipiniz : CİDDİ OBEZ");
        }
    }
}
