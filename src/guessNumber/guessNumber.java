package guessNumber;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(100);
        System.out.println(random);
        int counter=0;
        int right = 5;
        StringBuilder list= new StringBuilder();

        while (right > 0) {
            System.out.println(right + " hakkiniz var!");
            System.out.println("Bir sayi giriniz!: ");
            Scanner inp = new Scanner(System.in);
            int selected = inp.nextInt();
            list.append(selected+" ");

            if(!(selected<100 && selected>0)){
                counter++;
                System.out.println("Hatali veri girisi");
                if(counter>=2){
                    System.out.println("Bir hakkinizi kaybettiniz!");
                    right--;
                }

                continue;
            }

            if (selected == random) {
                System.out.println("Kazandiniz!");
                break;
            } else {
               if(right!=1){
                   System.out.println("Tekrar deneyiniz!");
                   if (selected < random) {
                       System.out.println("Daha buyuk bir sayi giriniz!");
                   } else {
                       System.out.println("Daha kucuk bir sayi giriniz!");
                   }
               }
            }
            right--;
        }
        if(right==0){
            System.out.println("Haklariniz tukendi. Kaybettiniz!");
        }
        System.out.print("Tahminleriniz: "+list);
    }

}
