package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk isminizi yazınız");
        String firstName = input.next();
        System.out.println("Soy isminizi Giriniz");
        String lastname = input.next();
        System.out.println(firstName+lastname);
    }
}
