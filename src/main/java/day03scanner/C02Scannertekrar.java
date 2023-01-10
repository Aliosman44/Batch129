package day03scanner;

import java.util.Scanner;

public class C02Scannertekrar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen Yaşınızı Giriniz");
   byte age= input.nextByte();

   Scanner scan = new Scanner (System.in);
        System.out.println("Kullanıcı Adınızı Giriniz");
        String ad= scan.nextLine();
        System.out.println("Memleketinizi Giriniz");
        String yer= scan.nextLine();
        System.out.println("Yaşınızı Giriniz");
        byte yas= scan.nextByte();
        System.out.println("Boyunuzu Giriniz");
        short boy= scan.nextShort();
        System.out.println("Memleketinizi Seviyormusuunuz.");
        boolean seviyormusun= scan.nextBoolean();
        System.out.println("**************");
        System.out.println("ad = " + ad);
        System.out.println("yer = " + yer);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyormusun = " + seviyormusun);







    }

}
