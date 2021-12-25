package devPatika;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir yıl girin:");
        int yil = inp.nextInt();
        boolean kosul =false;

        if(yil%4==0){

            if(yil%100 ==0)
            {
                if(yil%400 ==0)
                {
                    kosul=true;
                }
            }else{
                kosul = true;
            }
        }

        if(kosul == true)
        {
            System.out.println(""+Integer.toString(yil)+" yılı artık yıldır");
        }else{
            System.out.println(""+Integer.toString(yil)+" yılı artık yıl değildir.");
        }
    }
}
