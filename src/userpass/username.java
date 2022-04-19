package userpass;

import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        String userName, password, npassword, talep;
        int i = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("username: ");
        userName = inp.nextLine();
        System.out.print("password: ");
        password = inp.nextLine();

        if (userName.equals("orhan") && password.equals("12345")) {
            System.out.println("Basari ile giris yaptiniz!");
        } else if (userName.equals("orhan") && !(password.equals("12345"))) {
            while (i <= 3) {
                System.out.println("Hatali giris yaptiniz! Tekrar deneyiniz.");
                System.out.println("Sifrenizi sifirlamak ister misiniz? y or n");
                talep = inp.nextLine();
                if (talep.equals("y")) {
                    System.out.print("Yeni sifre giriniz:");
                    npassword = inp.nextLine();
                    if (npassword.equals("12345")) {
                        System.out.println("Yeni sifre eski sifre ile ayni olamaz!");
                        System.out.print("Yeni sifre giriniz:");
                        npassword = inp.nextLine();
                    }
                    System.out.println("Sifreniz basari ile degistirildi! Tekrar giris yapmayi deneyiniz.");
                    break;
                } else if (talep.equals("n")) {
                    System.out.print("username: ");
                    userName = inp.nextLine();
                    System.out.print("password: ");
                    password = inp.nextLine();
                    if (userName.equals("orhan") && password.equals("12345")) {
                        System.out.println("Basari ile giris yaptiniz!");
                        break;
                    }
                }
                i++;
            }
            if (i == 4) System.out.println("Hesabiniz kitlenmistir!");
        }
    }
}
