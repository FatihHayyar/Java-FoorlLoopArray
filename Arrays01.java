package day13LoopsArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int ogrrenciyaslari[]=new int[7];
        System.out.println(Arrays.toString(ogrrenciyaslari));
        //array a eleman koyma
        ogrrenciyaslari[1]=12;
        ogrrenciyaslari[2]=13;
        ogrrenciyaslari[3]=14;
        ogrrenciyaslari[4]=11;
        ogrrenciyaslari[5]=10;
        ogrrenciyaslari[6]=12;
        ogrrenciyaslari[0]=11;
        System.out.println(Arrays.toString(ogrrenciyaslari));
    //arrays daki herhangi bir elemani yazdirma
        System.out.println(ogrrenciyaslari[4]);
// arrays daki en kücük ve en büyük elemani bul
        Arrays.sort(ogrrenciyaslari);//kucukten buyuge siralar
        System.out.println(Arrays.toString(ogrrenciyaslari));
        int ilk=ogrrenciyaslari[0];
        int son=ogrrenciyaslari[ogrrenciyaslari.length-1];//arrayda length parantezsiz kullanilir.
        int toplam=ilk+son;
        System.out.println(toplam);
// arrays daki tum elemanlarin toplamini ekrana yazdirin
        int yenitop=0;
        for (int i=0; i<ogrrenciyaslari.length;i++){
            yenitop=yenitop+ogrrenciyaslari[i];
        }
        System.out.println(yenitop);
        //while ile yaoin
        int sum=0;
        int i=0;
        while (i<ogrrenciyaslari.length){
            sum=sum+ogrrenciyaslari[i];
            i++;
        }
        System.out.println(sum);
// do while ile yapin
        int k=0;
        int topp=0;
        do {
            topp=topp+ogrrenciyaslari[k];
            k++;
        }while (k<ogrrenciyaslari.length);
        System.out.println(topp);
//for each loop ile yapalim. mumkun oldukca tercih edilir.. arraylarda ve coolectionslarda kullanilir.
       int top3=0;
        for (int w:ogrrenciyaslari) {
    top3=top3+w;
        }
        System.out.println(top3);



    }
}

