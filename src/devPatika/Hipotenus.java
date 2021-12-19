package devPatika;
import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        double hipotenus;

        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci kenarı girin.");
        a= inp.nextInt();
        System.out.print("İkinci kenarı girin:");
        b=inp.nextInt();
        hipotenus=Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenus : "+hipotenus);
    }

}
