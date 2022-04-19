package bmi;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args){
        double height,weight,bmi=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("height (m): ");
        height=inp.nextDouble();

        System.out.print("weight (kg): ");
        weight=inp.nextDouble();

        bmi=weight/(height*height);

        System.out.print("BMI: "+bmi);
    }
}
