package devPatika;
import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        int gelenDeger;
        double kdv=0.18;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir fiyat girin:");
        gelenDeger = inp.nextInt();
        double kdvliFiyat= gelenDeger+(gelenDeger*kdv);
        System.out.println("Kdsiz fiyat: "+gelenDeger);
        System.out.println("Kdvli fiyat: "+kdvliFiyat);

    }
}
