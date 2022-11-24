package day13LoopsArrays;

public class Arrays02 {
    public static void main(String[] args) {
//String bir array yapin bu arraya 5 tane isim koyun. bu isimlerdeki karaktar sayisi toplamini yazdirin
String isimler[]=new String[5];
isimler[0]="Ali";
isimler[1]="Alak";
isimler[2]="ahmet";
isimler[3]="Akita";
isimler[4]="Asli";

int top=0;
for (String key : isimler){
    top=top+key.length();
}
        System.out.println(top);



    }
}
