package perfectNumber;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n=input.nextInt();
        int sum=0;
        if(n<=1){
            System.out.print(n+" mukemmel sayi degildir!");
        }else {
            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum += i;
                }
            }
            if(n==sum){
                System.out.print(n+" mukemmel sayidir!");
            }else {
                System.out.print(n+" mukemmel sayi degildir!");
            }
        }



    }
}
