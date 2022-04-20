package flyingPrice;

import java.util.Scanner;

public class flyingPrice {
    public static void main(String[] args) {
        int distance, age, flyingType;
        double perKm = 0.10, totalCost, cost, cutCost;

        Scanner inp = new Scanner(System.in);

        System.out.print("mesafe (km): ");
        distance = inp.nextInt();
        System.out.print("yas: ");
        age = inp.nextInt();
        System.out.println("Tek yon:1\nGidis-Donus:2 ");
        flyingType = inp.nextInt();

        if (age <= 0) {
            System.out.print("Hatali veri girisi!");
        } else {
            if (distance <= 0) {
                System.out.print("Hatali veri girisi!");
            } else {
                if (!(flyingType == 1 || flyingType == 2)) {
                    System.out.print("Hatali veri girisi!");
                } else {
                    if (flyingType == 1) {
                        if (age < 12) {
                            cost = perKm * distance;
                            cutCost = 0.5 * cost;
                            totalCost = cutCost;
                            System.out.println("Bilet ucretiniz: "+totalCost);
                        } else if (age >= 12 && age <= 24) {
                            cost = perKm * distance;
                            cutCost = 0.9 * cost;
                            totalCost = cutCost;
                            System.out.println("Bilet ucretiniz: "+totalCost);
                        } else if (age >= 65) {
                            cost = perKm * distance;
                            cutCost = 0.7 * cost;
                            totalCost = cutCost;
                            System.out.println("Bilet ucretiniz: "+totalCost);
                        } else {
                            cost = perKm * distance;
                            totalCost = cost;
                            System.out.println("Bilet ucretiniz: "+totalCost);
                        }

                    } else {
                        if (age < 12) {
                            cost = perKm * distance;
                            cutCost = 0.5 * cost;
                            totalCost = 0.8 * 2 * cutCost;
                            System.out.println("Bilet ucretiniz: "+totalCost);
                        } else if (age >= 12 && age <= 24) {
                            cost = perKm * distance;
                            cutCost = 0.9 * cost;
                            totalCost = 0.8 * 2 * cutCost;
                            System.out.println("Bilet ucretiniz: "+totalCost);
                        } else if (age >= 65) {
                            cost = perKm * distance;
                            cutCost = 0.7 * cost;
                            totalCost = 0.8 * 2 * cutCost;
                            System.out.println("Bilet ucretiniz: "+totalCost);
                        } else {
                            cost = perKm * distance;
                            totalCost = 0.8 * 2 * cost;
                            System.out.println("Bilet ucretiniz: "+totalCost);
                        }
                    }

                }


            }
        }
    }
}
