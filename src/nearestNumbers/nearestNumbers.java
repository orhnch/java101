package nearestNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class nearestNumbers {
    public static void main(String[] args) {
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        Scanner inp= new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int n=inp.nextInt();
        int j=0;
        Arrays.sort(numbers);

        if (n < numbers[(numbers.length-1)] && n > numbers[0] ){
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]<=n){
                    j=i;
                }
            }
            System.out.println("en yakin kucuk sayi: " +numbers[j]);
            System.out.println("en yakin buyuk sayi: " +numbers[j+1]);
        } else if (n==numbers[numbers.length-1]) {
            System.out.println("en yakin kucuk sayi: " +numbers[numbers.length-2]);
            System.out.println("en yakin buyuk sayi: " +numbers[numbers.length-1]);
        } else if (n==numbers[0]) {
            System.out.println("en yakin kucuk sayi: " +numbers[0]);
            System.out.println("en yakin buyuk sayi: " +numbers[1]);
        } else {
            System.out.println("Girdiginiz sayi liste araliginda degil. Lutfen tekrar deneyiniz");
        }

    }
}
