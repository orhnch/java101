package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
       int mat, fizik, kimya, turkce, tarih, muzik;

       Scanner inp = new Scanner(System.in);

       System.out.print("Mat: ");
       mat=inp.nextInt();

       System.out.print("Fizik: ");
       fizik=inp.nextInt();

       System.out.print("Kimya: ");
       kimya=inp.nextInt();

       System.out.print("Türkçe: ");
       turkce=inp.nextInt();

       System.out.print("Tarih: ");
       tarih=inp.nextInt();

       System.out.print("Müzik: ");
       muzik=inp.nextInt();

       int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
       double sonuc = toplam/6.0;

       System.out.println("Not Ortalaması: " + sonuc);

       if (sonuc<=60) {
          System.out.print("Kaldiniz!");
       }
       else {
          System.out.print("Geçtiniz!");
       }
    }
}
