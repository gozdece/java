package devPatika;

import java.util.Scanner;

public class usBul {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin:");
        int sayi = inp.nextInt();
        System.out.print("Üs girin:");
        int us = inp.nextInt();
        int deger =1;

        for(int i=1; i<=us; i++)
        {
            deger*=sayi;
        }

        System.out.println(deger);
    }
}
