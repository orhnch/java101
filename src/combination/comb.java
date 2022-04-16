package combination;

import java.util.Scanner;

public class comb {
    public static void main(String[] args){
        int i,j,k,n,r,m=1, x=1, y=1, total=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("n: ");
        n=inp.nextInt();
        System.out.print("r: ");
        r=inp.nextInt();

        for (i=1;i<=(n-r);i++){
            m*=i;
        }
        for(j=1; j<=n; j++){
            x*=j;
        }
        for (k=1; k<=r; k++){
            y*=k;
        }
        total=x/(y*m);
        System.out.print("result: "+total);
    }
}
