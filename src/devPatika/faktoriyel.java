package devPatika;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin:");

        int sayi = inp.nextInt();
        int fak=1;

        /*
        for(int i=1; i<=sayi; i++)
        {
            fak*=i;
        }
        System.out.println(fak);
        */
        int i=1;
        boolean kosul =true;
        while(i<=sayi)
        {
            fak*=i;
            i++;
        }
        System.out.println(fak);
    }
}
