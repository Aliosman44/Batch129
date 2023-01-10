package kendiKendime;

import java.util.Random;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        int random = new Random().nextInt(100);
        Scanner input = new Scanner(System.in);

        int tahmin = 0;
        int sayaç = 1;
        while (random != tahmin) {
            System.out.println("Lütfen bir sayı giriniz.");
            tahmin = input.nextInt();
            if (tahmin > random) {
                System.out.println("daha küçük bir sayı giriniz.");


            } else if (tahmin < random) {
                System.out.println("daha büyük bir sayı giriniz.");
            }

            System.out.println("Tuttğunuz sayı " + (sayaç-1)+ "tahminde bulundunuz.");
        }

    }}



