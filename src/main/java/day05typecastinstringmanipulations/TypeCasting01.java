package day05typecastinstringmanipulations;

public class TypeCasting01 {
    public static void main(String[] args) {

        /*
  Numeric primitive data type'larının birbirine dönüştürülmesine "Type Casting" denir.
  Numeric Data Type'lar byte-short-int-long-float-double
  Note 1: Küçük data type'larını büyük data type'larına çevirmeyi Java otomatik olarak yapabilir.
          Bu işleme "AutoWidening" (Otomatik Genişletme) denir.
  Note 2: Büyük data type'larını küçük data type'larına çevirmek riskli bir iştir,Java bu riskli işi otomatik olarak yapmaz.
          Bu işlemi kod yazanlar yapar.
          Bu işleme "ExplicitNarrowing"(Açıktan daraltma) denir.
 */
        byte age = 13;
        int ageInt = age;

        double number = 12.334;
        System.out.println(number);
        short numbershort = (short)number;
        System.out.println(numbershort);
        short num = 260;
        byte numByte = (byte)num;
    }
}
