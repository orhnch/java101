package bolme;

import java.util.Scanner;

public class ikiyedorde {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int sayi, total1 = 0, total2 = 0, total = 0;

        do {
            System.out.print("sayi giriniz:");
            sayi = inp.nextInt();
            if (sayi % 4 == 0) {
                total1 += sayi;
            } else if (sayi % 2 == 0) {
                total2 += sayi;
            }
        } while (sayi % 2 != 1 && sayi >= 0);
        total = total1 + total2;
        System.out.println("4\'e ve 2\'e bolunenler toplami: " + total1);
        System.out.println("Yalnizca 2\'e bolunenler toplami: " + total2);
        System.out.println("total: " + total);
    }
}
