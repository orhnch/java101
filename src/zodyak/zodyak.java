package zodyak;

import java.util.Scanner;

public class zodyak {
    public static void main(String[] args) {
        int age,mod;


        Scanner inp = new Scanner(System.in);

        System.out.print("Dogum Yiliniz: ");
        age = inp.nextInt();

        mod = age%12;

        switch (mod){
            case 0:
                System.out.print("Cin Zodyak burcunuz: Maymun");
                break;
            case 1:
                System.out.print("Cin Zodyak burcunuz: Horoz");
                break;
            case 2:
                System.out.print("Cin Zodyak burcunuz: Kopek");
                break;
            case 3:
                System.out.print("Cin Zodyak burcunuz: Domuz");
                break;
            case 4:
                System.out.print("Cin Zodyak burcunuz: Fare");
                break;
            case 5:
                System.out.print("Cin Zodyak burcunuz: Okuz");
                break;
            case 6:
                System.out.print("Cin Zodyak burcunuz: Kaplan");
                break;
            case 7:
                System.out.print("Cin Zodyak burcunuz: Tavsan");
                break;
            case 8:
                System.out.print("Cin Zodyak burcunuz: Ejderha");
                break;
            case 9:
                System.out.print("Cin Zodyak burcunuz: Yılan");
                break;
            case 10:
                System.out.print("Cin Zodyak burcunuz: At");
                break;
            case 11:
                System.out.print("Cin Zodyak burcunuz: Koyun");
                break;
        }

    }
}
