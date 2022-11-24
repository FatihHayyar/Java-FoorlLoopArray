package day13LoopsArrays;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        //kullanicidan alinan ismin ilk harfinin buyuk oldugunu kontrol edin
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("adinizi girin");
            String ad= scan.next();
            if (ad.charAt(0)>'Z'||(ad.charAt(0)<'A')){
                System.out.println("isim buyuk harfle baslamali");
            }else {System.out.println("isim kurallara uygun");
            break;}
        }while (true);




    }
}
