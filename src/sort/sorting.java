package sort;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac sayi gireceksiniz?: ");
        int n=input.nextInt();
        int[] arr =new int[n];

        for(int i=0;i<n;i++){
            System.out.print((i+1) +". sayi ");
            int a=input.nextInt();
            arr[i]=a;
        }
        Arrays.sort(arr);
        System.out.println("En buyuk sayi: "+arr[n-1]);
        System.out.println("En kucuk sayi: "+arr[0]);





    }
}
