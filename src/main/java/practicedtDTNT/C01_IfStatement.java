package practicedtDTNT;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*Kullanıcıdan bir gün alın
        Eğer gün cuma ise "müslümanlar için mübarek gün"
        Eğer gün cumaertesi ise "yahudiler için kutsak gün"
        Eğer gün pazar ide "Hristyanlar için kutsal gün"
        yazdıran kodu giriniz.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen gün isminini giriniz");
        String gün= input.next().toLowerCase();

        if(gün.equals("cuma")){
            System.out.println("müslümanlar için mübarek gün");
        } else if (gün.equals("cumaertesi")) {
            System.out.println("yahudiler için kutsak gün");
        } else if (gün.equals("pazar")) {
            System.out.println("Hristyanlar için kutsal gün");
        } else
            System.out.println("kutsal değil");



    }
}
