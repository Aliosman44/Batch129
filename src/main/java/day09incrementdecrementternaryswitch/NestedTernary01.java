package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
        //Verilen yılın "Artık yıl"(leap year) olup olmadığını kontrol eden kodu yazınız.
        // yıl 100 e bölünürse 400 e bölünmelidir. 1600 leap 1800 değil
        // yıl 100 e bölünmüyorsa 4'e bölünmelidir. 2004 leap 2005 değil.
        int year =1600;

        String result=year%100==0 ? (year/400==0 ? "leap" :"not leap"):(year%4==0 ? "leap":"Not leap");
        System.out.println(result);






    }
}
