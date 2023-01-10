package day07IfStatements;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {
        //Ay isimleri girilince kaçıncı ay olduğunu yazan kodu giriniz.
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen ay ismi giriniz.");
        String ay = input.next();

         if(ay.equalsIgnoreCase("ocak")) {
            System.out.println(1);
        }else if (ay.equalsIgnoreCase("şubat")){
            System.out.println(2);
        } else if (ay.equalsIgnoreCase("mart")){
            System.out.println(3);
         }else if (ay.equalsIgnoreCase("nisan")){
            System.out.println(4);
        }else if (ay.equalsIgnoreCase("mayıs")){
            System.out.println("5");
        } else if (ay.equalsIgnoreCase("haziran")) {
            System.out.println(6);
        }else
            System.out.println("geçerli ay ismi giriniz.");

         // Stringlerin eşitliklerini kontrol ederken "==" yerine "equals" kullanılır.

    }
    }

