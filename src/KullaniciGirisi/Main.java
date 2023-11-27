package KullaniciGirisi;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String userName, inputUserName, password, inputPassword, sifreSifirlamakIstiyorMu, newPassword;

        userName = "patika";
        password = "java101";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        inputUserName = input.next();

        System.out.print("Şifre : ");
        inputPassword = input.next();

        if (Objects.equals(inputUserName, userName) && Objects.equals(inputPassword, password)) {
            System.out.println("Giriş Yapıldı!");
        } else {
            System.out.println("Girilen Bilgiler Hatalı! Şifrenizi Sıfırlamak İster Misiniz? (Evet/Hayır)");
            sifreSifirlamakIstiyorMu = input.next();
            if (sifreSifirlamakIstiyorMu.equals("Evet")){
                System.out.print("Yeni Şifrenizi Yazın : ");
                newPassword = input.next();
                if (!Objects.equals(newPassword, password) && !Objects.equals(newPassword, inputPassword)) {
                    System.out.println("Yeni Şifre Başarıyla Oluşturuldu!");
                } else {
                    System.out.println("Şifre Oluşturulamadı! Lütfen Yeniden Deneyin.");
                }
            } else if (sifreSifirlamakIstiyorMu.equals("Hayır")) {
                System.out.println("Program Sonlandırıldı! İyi Günler.");
            } else {
                System.out.println("Lütfen Sadece 'Evet' veya 'Hayır' Yazın!");
            }
        }
    }
}
