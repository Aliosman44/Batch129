package day07IfStatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Verilen bir sayının ppozitif negatif veya nötr olduğunu kontrol eden kodu giriniz.

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int s1= input.nextInt();
        if(s1>0){
            System.out.println("Pozitif");
        }else if(s1<0){
            System.out.println("Negatif");
        }else {
            System.out.println("Notr");
        }


        }


    }

//if (h1>='A'&& h1<='Z') {
//            System.out.println("Büyük Harf");
//
//        }if (h1>='a' && h1<='z'){
//            System.out.println("Küçük harf");