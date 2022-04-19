package circlepart;

import java.util.Scanner;

public class circlepart {
    static double areaPartofCircle(double angel, double r, double pi){
        double area=(pi*r*r*angel)/360;
        return area;
    }
    public static void main(String[] args){
        double a,b,pi;
        pi=3.14;
        Scanner inp = new Scanner(System.in);
        System.out.print("angel: ");
        a=inp.nextDouble();
        System.out.print("r: ");
        b=inp.nextDouble();

        System.out.print("Area part of circle: "+ areaPartofCircle(a,b,pi));
    }
}
