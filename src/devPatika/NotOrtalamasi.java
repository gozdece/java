package devPatika;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //degiskenleri olustur
        int mat,fizik,kimya,tarih,turkce,muzik;

        //scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz:");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuz:");
        kimya = inp.nextInt();
        System.out.print("Tarih notunuz:");
        tarih = inp.nextInt();
        System.out.print("Turkce notunuz:");
        turkce = inp.nextInt();
        System.out.print("Muzik notunuz:");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+tarih+turkce+muzik);
        double sonuc = toplam/6;

        if(sonuc>=60)
        {
            System.out.println("geçti");
        }else{
            System.out.println("kaldı");
        }

    }
}
