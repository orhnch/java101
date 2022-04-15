package kdv;
import java.util.Scanner;

public class kdv {
     public static void main(String[] args) {
         double price, kdv=0.18, kdv2=0.08, akdv;
         Scanner inp= new Scanner(System.in);
         System.out.print("Price: ");
         price=inp.nextDouble();
         System.out.println("Kdv\'siz tutar: "+price);

         if(price <=1000 && price>0){
             akdv = price * kdv;
             price += akdv;
             System.out.println("Kdv orarı: "+kdv);
             System.out.println("Kdv tutari: " +akdv);
             System.out.print("Total: " +price);
         } else if (price>1000) {
             akdv= price*kdv2;
             price += akdv;
             System.out.println("Kdv Orani: "+kdv2);
             System.out.println("Kdv tutari: " +akdv);
             System.out.print("Total: " +price);
         } else {
             System.out.print("Gecerli tutar giriniz!");
         }
     }
}
