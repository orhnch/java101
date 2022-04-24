package primeNumber;

import java.util.Scanner;

public class isPrimeNumber {
    static boolean isPrimeNumber(int num,int num2){
        if (num2==1){
            return true;
        } else if (num%num2==0) {
            return false;
        }
        return isPrimeNumber(num,--num2);
    }


    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.println("2 ve uzeri bir sayi giriniz: ");
        int n=inp.nextInt();
        int x=n-1;
        while(n<=1){
            System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz!");
            System.out.println("2 ve uzeri bir sayi giriniz: ");
            n=inp.nextInt();
            x=n-1;
        }
        if (isPrimeNumber(n,x)){
            System.out.println(n+" asal sayidir!");
        }else {
            System.out.println(n+" asal sayi degildir!");
        }
    }
}
