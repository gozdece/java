package devPatika;

import java.util.Scanner;

public class ikininKatlari {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int sayi = inp.nextInt();
        int kat=0;
        double deger=1;

        do{
            System.out.println(deger);
            deger =Math.pow(2,kat);
            kat++;
        }while(deger<sayi);
    }
}
