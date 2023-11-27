package DersOrtalamasiHesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Değişkenleri Oluştur
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Scanner Sınıfımızı Tanımladık
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan Değerleri Al
        System.out.println("Matematik Notunuzu Girin: ");
        matematik = input.nextInt();

        System.out.println("Fizik Notunuzu Girin: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuzu Girin: ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuzu Girin: ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuzu Girin: ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuzu Girin: ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;

        int gecmeNotu = 60;
        boolean durum = ortalama<=gecmeNotu;
        String gecmeDurumu;
        gecmeDurumu = (durum==true) ? "Kaldınız :(" : "Geçtiniz :)";



    }
}
