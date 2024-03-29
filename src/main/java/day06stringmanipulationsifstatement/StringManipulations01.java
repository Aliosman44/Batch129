package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example1: BirString in baş ve sonunda sspace caharacteri varsa siliniz.
        // "   Ali Can   "    "Ali Can"
        // trim metodu bir Stringdeki baş ve sondaki space  characteri siler, aradaki spcelere dokunmaz.
        String s= "  Ali Can   ";
        System.out.println(s);
        String sTrimmed=s.trim();
        System.out.println(sTrimmed);
        //Aşağıda fiyatları verilen ürünlerin toplam fiyatını bulunuz.
       // String tv =  "$456.99"; String laptop = "$875.99";
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);// 456.99

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);// 875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98
        // Verilen ilk ismin ilk harfini ve soy ismin ilk harfini yazdırınız.

        String name= "    ali cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);
        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);
        System.out.println("" + first+second);
        //Example 4: Bir String'in hic karakter icermedigini(Bos String) kontrol eden kodu yaziniz
        String str = "";
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu ?" + result2);//true

        //Example 5: Bir String'in space haric hicbir karakter icermedigini(Bos String) kontrol eden kodu yaziniz
        String t = "      ";

//1.YOL:
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var?" + result3);//true

//2.YOL:
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var?" + result4);//true

//3.YOL:
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var?" + result5);//true

        //Example 6: Bir String'de a, e, i character'lerinin ilk gorunumulerinin indexleri toplamini yazdiriniz
//           "Java is easy to learn" ==>


        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);

        int idxI = r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println("Index'ler Toplami : " +(idxA + idxI + idxE));

        //Example 7: Bir String'de "Java" kelimesinin ilk olarak kacinci index'te kullanildigini gosteren kodu giriniz
//   "Ah Java vah Java sensiz olmuyor Java." ==> 3
        String u = "Ah Java vah Java sensiz olmuyor Java.";
//indexOf("Java") kullaniminda ssiz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index'ini almis olursunuz

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //Example 8: Bir String'de a, i, e character'lerinin "son" gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 18 + 5 + 17 = 40
        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);// 18


        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println(idxOfA + idxOfI + idxOfE);//40

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir

        //Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
   //      Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
//      if you study hard, you will learn Java.
        //Example 10: Sayi pozitif ise ekrana pozitif yazdirin
        int num = 12;

        if (num>0){
            System.out.println("Pozitif");//Pozitif
        }
        //Example 11: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin
        int number = 3;

        if (number>-1 && number<10){
            System.out.println("Rakam");//Rakam
        }
        //Example 9: Bir String'deki tekrarsiz karakterleri ekrana yazdiriniz
//    abbccdc ==> ad
        String y = "aac";

        char ch1 = y.charAt(0);

        if (y.indexOf(ch1)==y.lastIndexOf(ch1)) {
            System.out.println(ch1);//c
        }

        char ch2 = y.charAt(1);
        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);//c
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3)) {
            System.out.println(ch3);//C


        }
        //Example 12: Sayi uc basamakli ise ekrana "Wooow!" yazdirin
        int n = -123;

        n = Math.abs(n);

        if(n>99 && n<1000){
            System.out.println("Wooow!");//Wooow!
        }




    }
}
