package ebobEkok;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {

        int i=1,ebob=1,ekok=1;
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        int x=input.nextInt();
        System.out.print("y: ");
        int y=input.nextInt();

        if(x<y){
            while (i<=x){
                if(x%i==0 && y%i==0){
                    ebob=i;
                }
                i++;
            }
            System.out.println("EBOB: "+ebob);
        }else if(y<x){
            while (i<=y){
                if(x%i==0 && y%i==0){
                    ebob=i;
                }
                i++;
            }
            System.out.println("EBOB: "+ebob);
        }else {
            System.out.println("EBOB: "+x);
        }

        if(x==y){
            System.out.print("EKOK: "+x);
        }else {
            while(i<=(x*y)){
                if(i%x==0 && i%y==0){
                    ekok=i;
                }
                i++;
            }
            System.out.print("EKOK: "+ekok);
        }
    }
}
