package us;

import java.util.Scanner;

public class us {
    public static void main(String[] args){
        int j=1,k=1,n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Max value: ");
        n=inp.nextInt();

        System.out.println("Degrees of 4");
        for(j=1; j<n; j*=4){
            System.out.println(j);
        }
        System.out.println("Degrees of 5");
        for (k=1; k<n; k*=5){
            System.out.println(k);
        }
    }
}
