package day03scanner;

import java.util.Scanner;

public class C03Scannertekrar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı 1 i giriniz");
        double sayı1= input.nextDouble();

        System.out.println("Sayı 2 yi giriniz");
        double sayı2=input.nextDouble();
        System.out.println("Toplam" + (sayı1+sayı2));
        }

    }

//System.out.println("Kullanıcı Adınızı Giriniz");
//        String ad= scan.nextLine();