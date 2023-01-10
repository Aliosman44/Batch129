package day05typecastinstringmanipulations.day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Kullanıcıdan iki sayı ve yapılacak işlemi alan +,-,*,/,% işlemlerini yapan kodu giriniz.

        Scanner input =new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yappılacak işlemi giriniz. +,-,*,/,% dan birini seçiniz");
        char opr = input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a + '+'+  b+"="+(a+b));
                break;
            case '-':
                System.out.println(a + '-'+  b+"="+(a-b));
                break;
            case '*':
                System.out.println(a + '*'+  b+"="+(a*b));
                break;
            case '/':
                System.out.println(a + '/'+  b+"="+(a/b));
                break;
            case '%':
                System.out.println(a + '%'+  b+"="+(a*b/100));
                break;
            default:
                System.out.println("bu işlem tanımlanmamıştır");

        }
    }
}
