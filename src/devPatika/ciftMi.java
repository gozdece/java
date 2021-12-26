package devPatika;

import java.util.Scanner;

public class ciftMi {
    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int sayi = inp.nextInt();

        for(int i=sayi; i>=0; i--)
        {
            if(i%2==0)
            {
                System.out.print(""+i+"-");
            }
        }

        System.out.println();
        int i=0;
        while (i<=sayi) {
            if(i%2==0)
            {
                System.out.print(""+i+"-");
            }
            i++;
        }



    }
}
