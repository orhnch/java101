package manav;

import java.util.Scanner;

public class manav {
    public static void main(String[] args){
        double a=2.14, e=3.67, d=1.11, m=0.95, p=5, total;
        int akg,ekg,dkg,mkg,pkg;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kac kg?: ");
        akg=inp.nextInt();

        System.out.print("Elma kac kg?: ");
        ekg=inp.nextInt();

        System.out.print("Domates kac kg?: ");
        dkg=inp.nextInt();

        System.out.print("Muz kac kg?: ");
        mkg=inp.nextInt();

        System.out.print("Patlican kac kg?: ");
        pkg=inp.nextInt();

        total=a*akg+e*ekg+d*dkg+m*mkg+p*pkg;

        System.out.print("toplam: "+total);
    }
}
