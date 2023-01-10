package practice_nighttine;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Techproed spor solunu için kullanıcıdan isim soyisim yaş kilo, boy salona devam edeceği ay süresi bilgilerini alıp aylık
        // 20$ olarak toplam ücreti hesapayınız.
        Scanner input = new Scanner (System.in);
        System.out.println("TechproEd spor salonuna hoşgeldiniz.");
        System.out.println("Lütfen isminizi giriniz");
        String isim=input.next();
        System.out.println("Lütfen yaşınızı giriniz");
        byte yaş= input.nextByte();
        System.out.println("Lütfen kilonozo giriniz");
        double kilo=input.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz");
        double boy=input.nextDouble();
        int aylıkÜcret=20;
        System.out.println("aylık ücret="+aylıkÜcret+"$");
        System.out.println("Lütfen kaç ay devam edeceğinizi giriniz");
        int aylık = input.nextInt();
        int toplamTutar= aylıkÜcret*aylık;
        System.out.println("toplam Tutar="+toplamTutar+"$");
        System.out.println("tamIsim = " + isim+ "\nYasiniz : "+yaş+"\nKilo : "+kilo+"\nBoy : "+boy+"\nOdemeniz gereken toplam tutar : "+toplamTutar+" $");

    }
}
