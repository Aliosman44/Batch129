package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        int r1 = a<b ? a++ :++b;

        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);

        // verilen bir sayının mutlak değerini hesaplayan kodu yazınız.
        int c = -4;
        int r2=c<0 ? -1*c : c;
        System.out.println(r2);
        // İki sayının işareti aynı ise bu sayıları çarpan, işaretleri farklı ise
        // "farklı işaretli ssayıları çarpamıyorum" mesajı veren kodu yazınız.

        int m= 5;
        int n= -6;
        Object r3=(m>0&&n>0)|| (m<0 && n<0) ? m*n : "Farklı işaretli sayıları çarpamıyorum.";
        System.out.println(r3);
        //object java da bütün non prpimitive data typelerinin ortak parent idir.
        //"object in parent iyoktur.
        // FArklı data type leri için ortak bir variable oluşturmak istediğinizde,
        // data type olarak object kullanabilirsiniz.

        // Size verilen sayının 3 basamaklı olup olmadığını gösteren kodu yazınız.
        int p = -436;


        int r = Math.abs(p);

        String r4 = r>99 && r<1000 ? p + " uc basmaklidir" : p + " uc basmakli degildir";
        System.out.println(r4);



    }
}
