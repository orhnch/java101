package hesapMakinesi;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
            double a,b,result;
            int select;

            Scanner inp = new Scanner(System.in);
            System.out.print("Ilk sayiyi giriniz: ");
            a=inp.nextDouble();
            System.out.print("Ikinci sayiyi giriniz: ");
            b=inp.nextDouble();

            System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme: ");
            System.out.print("Islem seciniz: ");
            select=inp.nextInt();

            while (!(select > 0 && select <=4)) {
                System.out.println("Girilen islem hatali. Gecerli bir islem seciniz!");
                System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme: ");
                System.out.print("Islem seciniz: ");
                select = inp.nextInt();
            }
            switch (select) {
                case 1:
                    result = a + b;
                    System.out.println("Sonuc :" + result);
                    break;
                case 2:
                    result = a - b;
                    System.out.println("Sonuc :" + result);
                    break;
                case 3:
                    result = a * b;
                    System.out.println("Sonuc :" + result);
                    break;
                case 4:
                    if(b==0){
                        System.out.println("Herhangi bir sayi 0'a bolunemez");
                        break;
                    }
                    result = a / b;
                    System.out.println("Sonuc :" + result);
                    break;

            }
    }
}
