package oneri;

import java.util.Scanner;

public class oneri {
    public static void main(String[] args) {
        int heat;

        Scanner inp= new Scanner(System.in);

        System.out.println("Sicakligi giriniz: ");
        heat=inp.nextInt();

        if(heat < 5)
            System.out.println("Kayak yapabilirsin.");
        else if (heat>=5 && heat <=15 )
            System.out.println("Sinema da olur");
        else if (heat>15 && heat <=25 )
            System.out.println("Piknik iyi gider");
        else
            System.out.println("Deniz,kum,gunes");


    }
}
