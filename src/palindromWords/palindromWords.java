package palindromWords;

import java.util.Scanner;

public class palindromWords {
    static boolean isPalindrome(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String str=inp.nextLine();
        System.out.println(isPalindrome(str));
    }
}
