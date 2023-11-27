package MayinTarlasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, column;

        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");
        System.out.println("Lütfen Oynamak İstediğiniz Boyutları Giriniz.");

        System.out.print("Satır Sayısı: ");
        row = scan.nextInt();

        System.out.print("Sütun Sayısı: ");
        column = scan.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row, column);
        mayin.run();
    }
}
