package day07IfStatements;

import java.util.Scanner;

public class IfStatements06 {
    public static void main(String[] args) {

        /*Kullanıcıdan yaş değerini alan ve yaşın hangi evrede olduğunu aşağıdaki tobloya göre
         yazdıran kodu oluşturunuz.
                8-4==> bebek
                9-12==>çocuk
                13-20==>genç
                21-30==>yetişkin*/
        Scanner input= new Scanner(System.in);
        System.out.println("Yaş değerini giriniz");
        byte yaş= input.nextByte();
        if(yaş>3&&yaş<9){
            System.out.println("bebek");
        } else if (yaş>8&&yaş<13) {
            System.out.println("çocuk");
        }else if (yaş>12 &&yaş<21){
            System.out.println("genç");
        } else if (yaş>20&&yaş<31) {
            System.out.println("yetişkin");
        }else
            System.out.println("Geçerli bir yaş giriniz");
    }
}
