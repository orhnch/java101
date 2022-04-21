package fibonacciSeries;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayisi: ");
        int n = inp.nextInt();
        int[] fb= new int[n];
        fb[0]=0;
        fb[1]=1;

        for (int i=2;i<=n-1;i++){
            fb[i]=fb[i-1]+fb[i-2];
        }
        for(int k=0;k<=n-1;k++){
            System.out.print(fb[k]+" ");
        }
    }
}
