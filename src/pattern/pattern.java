package pattern;

import java.util.Scanner;

public class pattern {

    static  int patternplus(int num,int num2) {
        System.out.print(num2 + " ");
        if (num2 <= 0) {
            return patternminus(num, num2);
        }
        num2 -= 5;

        if (num == num2) {
            return num;
        } else {
            return patternplus(num, num2);
        }
    }

    static  int patternminus(int num,int num2){
        System.out.print(num2+" ");
        num2+=5;

        if (num==num2) {
            return num;
        }else {

            return patternminus(num,num2);
        }

    }

    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int n=inp.nextInt();
        int m=n;
        if(n<0){
            patternminus(m,n);
        } else{
            patternplus(m,n);
        }
        System.out.print(n);
    }
}
