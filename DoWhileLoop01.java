package day13LoopsArrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //kullanicidan sayi al, sayi 100 den kucuk ise ekrana kazandin yazdirin
        //aksi halde ekrana kaybettin yazdirin. kullanici kazandikca oyun devam etmeli.

        Scanner unit= new Scanner(System.in);
int sayi=0;

        do {
            System.out.println("bir sayi girin");
           sayi= unit.nextInt();
            if (sayi<100){
                System.out.println("kazandiniz");
            }
        }while (sayi<100);
        System.out.println("kaybettiniz");




    }
}
