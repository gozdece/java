package devPatika;

import java.util.Scanner;

public class tekSayiTopla {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int toplam=0;
        int sayi;
        do {
            System.out.print("Bir sayı girin:");
            sayi = inp.nextInt();

            if(sayi>0)
            {
                if(sayi%2==1)
                {
                    toplam+=sayi;
                }
            }
        }while (sayi>0);

        System.out.println(toplam);
    }
}
