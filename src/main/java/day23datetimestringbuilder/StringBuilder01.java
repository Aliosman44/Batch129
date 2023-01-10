package day23datetimestringbuilder;

public class StringBuilder01 {

    // Java'da String, String Class kullanılarak veya "StringBuilder Class" kullanılarak oluşturulabilir.
    //"String Class" kullanarak ürettiğimiz String'ler "Immutable" (Değiştirilemez) dir.
    // "StringBuilder Class" kullanarak ürettiğiniz String'ler "Mutable"(Değiştirilebilir) dir.

    public static void main(String[] args) {
        //Immutable
        String s = "Java";
        String t = s+ "!";
        String w = t+ "?";

        // String' i değiştirdikten sonra  aynı String assign ederseniz, Java yıne yeni bir container oluşturur,
        // değişmiş değeri bu yeni konteynırın içine koyar ve eski konteynır gösteren oku yeni konteynıra yönlendirir.
        // Dolayısıyla eski konteynır adressiz kalır, ve "Garbage Collector" adressiz olan konteynırları siler.
        String a = "Money";
        a= a+ "More";


        //Mutable
        // StringBuilder kullanarak String üretmenin 1. Yolu.
        StringBuilder sb1=new StringBuilder("Python");
        System.out.println(sb1);//Python

        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?.

        // StringBuilder kullanarak String üretmenin 2. Yolu.
        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2.length());//0

        //StringBuilder kullandığınızda başlangıç noktası 16 dir.
        // kapasite aşıldığında varolan kapasitenin iki fazlası kadar varaolan kapasiteye ekleme yapılır.
        System.out.println(sb2.capacity());//16
        sb2.append("Python");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxx");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70

        // StringBuilder kullanarak String üretmenin 3. Yolu.

        StringBuilder sb3= new StringBuilder(2);
        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6


        //insert string arasına ifade koyar.
        sb3.insert(2,"xxxxxx");
        System.out.println(sb3.length());//9
        System.out.println(sb3);//Flxxxxxxo

        //toString () metodu StringBuilder'i Stringe çevirir.
        // String Class' ta var olan ama String BuilderClass ta var olmayan split() method gibi
        // methodlara ihtiyaç duyduğumuzda toString () metodunu kullanarak String Class geçer ve o methodları kullanırız.

        sb3.toString().split("l");
       // reverse() methodu Stringleri ters çevirir.
        sb3.reverse();
        System.out.println(sb3); //oxxxxxxlF


        //deleteCharAt (1) index 1 deki characteri siler.
        sb3.deleteCharAt(1);
        System.out.println(sb3);//oxxxxxlF

        //delete(1,6); index 1 deki karakterden index 5 (6 dahil olamdığı için 5 yazdım) deki karaktere kadar tüm karaakterleri siler.
        sb3.delete(1,6);
        System.out.println(sb3 );//olF


        //// -1 verir. Yani alfabetik sira olarak J harfi, K harfinden 1 oncedir.
        //// compareTo() alfabetik olarak karsilastirir. Bu method ascii degerlere gore islem yapar.
        //// compare (ENG) == karsilastirma (TR)
        StringBuilder sb5=new StringBuilder("Java");
        StringBuilder sb6= new StringBuilder("Kava");
        System.out.println(sb5.compareTo(sb6)); //-1


        //setCharAt index 2 deki karakteri m' ye çevirir.
        sb6.setCharAt(2,'m');
        System.out.println(sb6);//Kama

        sb6.replace(1,3,"xyz");
        System.out.println(sb6);//<Kxyza

        //StringBuilder Class ta kullanmamıza izin verilen substring() method gibi bazı String Classları vardır.,
        //bu methodları StringBuilder üstünde kullanınca StringBuilder in orjinal değeri değişmez.
        String s7= sb6.substring(1,3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Kxyza
    }


}
