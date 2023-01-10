package day07IfStatements;

import java.util.Scanner;

public class IfExercises {
    public static void main(String[] args) {
        int s1= 5;
        if(s1>0){
            System.out.println("pozitif");

        }
        int s2 = 6;
        if(s2>1&& s2<10){
            System.out.println("s2= rakam");
        }
       int s3 = 25;
        if(s3>99&& s3<1000 ){
            System.out.println("woow");

        }
        char h1 = 'b';
        if (h1>='A'&& h1<='Z') {
            System.out.println("Büyük Harf");

        }if (h1>='a' && h1<='z'){
            System.out.println("Küçük harf");
        }
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen karakter giriniz");
        char ch= input.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Büyük harf");
        }else if(ch>='a'&& ch<='z'){
            System.out.println("Küçük harf");
        }else{
            System.out.println("harf değil");

        }
        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı= scan.nextInt();

        if(sayı%2==0){
            System.out.println("çift sayı");
        } else if (sayı%2!=0) {
            System.out.println("Tek Sayı");
            
        }


    }


}
