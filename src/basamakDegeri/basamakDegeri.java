package basamakDegeri;

import java.util.Scanner;

public class basamakDegeri {
    public static void main(String[] args) {
        int number,n2,counter=0,sum=0,a=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("bir sayi giriniz: ");
        number = inp.nextInt();

        n2=number;

        while (n2!=0){
            n2/=10;
            counter++;
        }


        for(int i=0;i<counter;i++){
            a=number%10;
            sum+=a;
            number/=10;
        }
        System.out.print(sum);
    }
}
