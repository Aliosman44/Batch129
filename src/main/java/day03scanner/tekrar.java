package day03scanner;

import java.util.Scanner;

public class tekrar {
    //Scanner input = new Scanner (System.in);
     //   System.out.println("Lütfen Yaşınızı Giriniz");
   // byte age= input.nextByte();
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("kısa kenerı giriniz");
        byte shortkenar= input.nextByte();

        System.out.println("uzun kenarı giriniz.");
        byte longkenar= input.nextByte();

        System.out.println("çevre= " +(2 *shortkenar+2*longkenar));
        System.out.println("alan= "+(shortkenar*longkenar));
    }
}
