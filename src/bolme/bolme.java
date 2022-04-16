package bolme;

import java.util.Scanner;

public class bolme {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int sayi;
        System.out.print(" sayi giriniz:");
        sayi = inp.nextInt();

        float i=0, sum1=0, sum2=0, sum3=0;
        float ort;


        while(i<=sayi){

            if(i%3==0 && i%4==0){
                sum1 += i;
            } else if (i%3==0) {
                sum2 += i;
            } else if (i%4==0) {
                sum3 += i;
            }
            i++;
        }
        System.out.println(sum1); //3 ve 4'e tam bolunenler
        System.out.println(sum2); //Yalniz 3'e
        System.out.println(sum3); //Yalniz 4'e

        float b=(sum1+sum2+sum3);
        System.out.println("Toplam: "+b);

        ort= b / 3;

        System.out.println("ortalama: "+ort);
    }

}
