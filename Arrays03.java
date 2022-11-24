package day13LoopsArrays;

public class Arrays03 {
    public static void main(String[] args) {
        //char bir arrays olusturun. bu arraya 5 eleman ekleyin. bu array daki buyuk harfleri yazdirin
char ch[]={'a', 'B', 'c', 'D', 'e'}; //arraya elemanlari kisa yoldan yazma yolu

for (char c : ch) {
    if (c >= 'A'&c<='Z'){
        System.out.print(c+" ");
    }
}
    }
}
