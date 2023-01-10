package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kısa kenarı giriniz.");
        float shortSide = input.nextFloat();
        System.out.println("uzun kenerı giriniz.");
        float longSide =input.nextFloat();
        System.out.println("Alan =" +(shortSide*longSide));
        System.out.println("cevre =" +(2*shortSide+2*longSide));
    }
}
