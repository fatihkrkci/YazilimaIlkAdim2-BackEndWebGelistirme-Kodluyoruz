package ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String userName, inputUserName, password, inputPassword;
        int denemeHakki = 3;
        int balance = 1500;
        int select;

        userName="patika";
        password="java101";

        Scanner input = new Scanner(System.in);

        while(denemeHakki > 0) {
            System.out.print("Kullanıcı Adınız : ");
            inputUserName = input.next();

            System.out.print("Şifreniz : ");
            inputPassword = input.next();

            if(inputUserName.equals(userName) && inputPassword.equals(password)){
                System.out.println("Merhaba " + userName + ", Kodluyoruz Bankasına Hoş Geldiniz!");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Para Miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para Miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Yetersiz Bakiye!");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.println("Çıkış Yapıldı. Tekrar Görüşmek Üzere");
                break;
            } else {
                denemeHakki--;
                System.out.println("Kullanıcı Adı veya Şifre Hatalı, Tekrar Deneyiniz!");
                if (denemeHakki == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur. Banka ile İletişime Geçiniz!");
                } else {
                    System.out.println("Kalan Deneme Hakkı : " + denemeHakki);
                }
            }
        }
    }
}
