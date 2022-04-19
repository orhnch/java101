package ort;

import java.util.Scanner;

public class ort {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, counter = 0, total = 0;
        double avg = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        matematik = inp.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            total += matematik;
            counter++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            counter++;
        }

        System.out.print("Turkce notunuz: ");
        turkce = inp.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            counter++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            total += kimya;
            counter++;
        }

        System.out.print("Muzik notunuz: ");
        muzik = inp.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            counter++;
        }

        avg = total / counter;

        if (avg < 55) {
            System.out.println("Ortalamaniz: " +avg);
            System.out.println("Kaldiniz!");
        } else {
            System.out.println("Ortalamaniz: " +avg);
            System.out.println("Gectiniz!!!");
        }
    }
}
