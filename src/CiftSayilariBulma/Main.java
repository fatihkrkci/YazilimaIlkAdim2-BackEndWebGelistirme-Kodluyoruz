package CiftSayilariBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin : ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
