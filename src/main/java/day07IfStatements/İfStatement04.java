package day07IfStatements;

import java.util.Scanner;

public class İfStatement04 {
    public static void main(String[] args) {

        //Gün sayısını verdiğinizde gün ismini yazan kodu giriniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Gün sayısını giriniz.");
        int gün = input.nextInt();

        if (gün == 1) {
            System.out.println("pazar");
        }else if (gün == 2) {
            System.out.println("pazartesi");
        }else if (gün == 3) {
            System.out.println("Salı");
        }else if (gün == 4) {
            System.out.println("Çarşamba");
        }else if (gün == 5) {
            System.out.println("Perşembe");
        }else if (gün == 6) {
            System.out.println("Cuma");
        }else if (gün == 7) {
            System.out.println("Cumaertesi");
        }else{
            {System.out.println("Hatalı giriş yaptınız. 1 ile 7 arasında birsayı giriniz");

            }

        }
    }
}
