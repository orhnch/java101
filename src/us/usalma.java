package us;

import java.util.Scanner;

public class usalma {
    static int exp(int n, int a){
        int result=1;
        if(a==0)  return result;
        for (int i=1;i<=a;i++){
            result*=n;
        }
        return result;
    }
    public static void main(String[] args){
        int n,a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban degeri: ");
        n=inp.nextInt();
        System.out.print("Us degeri: ");
        a=inp.nextInt();
        System.out.print("Sonuc: "+exp(n,a));
    }
}
