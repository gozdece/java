package devPatika;

public class Variables {
    public static void main(String[] args) {
        //primative
        //<veri tipi> <değişken ismi> =veri(değer) "sudoku"

        //tam sayıları veren veri tipi
        int numberOne=10;
        int numberThree,numberTwo=2;
        numberThree = numberOne+numberTwo;

        //byte 8bit uzunluğunda. Max 127, min -128
        byte vByte=100;

        //short 16bit uzunluğundadır. Max 32.767 Min -32.768
        short vShort=1000;

        //int 32bit uzunluğunda Max 2.147.483,647 Min -2.147.483.648
        int vInt = 10000;

        //long 34bit uzunluğunda
        long vLong=1000000;

        //float 32bit boyutunda ondalıklı sayılar
        float vFloat=1.45f;

        //double değer aralığı daha geniş
        double vDouble=3.14;

        //char karakterleri tutar
        char vChar='b';
        char vChar2=98;

        //non-primative
        String vStr="Hello world";
        System.out.println(vStr);
    }
}
