package ucgenalan;

import java.util.Scanner;

public class ucgenalan {
    static double ucgenalan(double a, double b, double c){
        double u=0;
        double area2=0, area=0;
        u=(a+b+c)/2;
        area2=u*(u-a)*(u-b)*(u-c);
        System.out.println(area2);
        area=Math.sqrt(area2);
        return area;
    }
    public static void main(String[] args){
        double a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("a: ");
        a=inp.nextDouble();
        System.out.print("b: ");
        b=inp.nextDouble();
        System.out.print("c: ");
        c=inp.nextDouble();

        System.out.print("Ucgen alani: "+ ucgenalan(a,b,c));
    }
}
