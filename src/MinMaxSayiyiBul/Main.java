package MinMaxSayiyiBul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Integer findMin(List<Integer> list)
    {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }

        List<Integer> sortedlist = new ArrayList<>(list);

        Collections.sort(sortedlist);

        return sortedlist.get(0);
    }

    public static Integer findMax(List<Integer> list)
    {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }

        List<Integer> sortedlist = new ArrayList<>(list);

        Collections.sort(sortedlist);

        return sortedlist.get(sortedlist.size() - 1);
    }

    public static void main(String[] args)
    {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        sayi = input.nextInt();

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < sayi; i++) {
            System.out.print(i+1 + ". Sayıyı Giriniz : ");
            list.add(input.nextInt());
        }

        System.out.println("En Büyük Sayı : " + findMax(list));
        System.out.println("En Küçük Sayı : " + findMin(list));
    }
}
