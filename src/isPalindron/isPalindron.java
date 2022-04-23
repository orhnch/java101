package isPalindron;

import java.util.Scanner;

public class isPalindron {
    static boolean isPalindrom(int num){
        int a, reverseNum=0, lastNumber;

        a=num;

        while (a!=0){
            lastNumber = a % 10;
            reverseNum = (reverseNum * 10) + lastNumber;
            a /= 10;
        }
        return num == reverseNum;
    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int p=inp.nextInt();
        System.out.println(isPalindrom(p));

    }
}
