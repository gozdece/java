package devPatika;

import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin:");
        int yil = inp.nextInt();
        int sonuc = yil%12;
        String burc="";

        switch (sonuc){
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc="Horoz";
                break;
            case 2:
                burc="Köpek";
                break;
            case 3:
                burc ="Domuz";
                break;
            case 4:
                burc ="Fare";
                break;
            case 5:
                burc="Öküz";
                break;
            case 6:
                burc="Kaplan";
                break;
            case 7:
                burc="Tavşan";
                break;
            default:
                burc="Ejderha";
                break;
        }

        System.out.println("Çin zodyağı burcunuz:"+burc);

    }
}
