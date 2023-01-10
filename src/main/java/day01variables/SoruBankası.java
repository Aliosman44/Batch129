package day01variables;

public class SoruBankası {
    public static void main(String[] args) {
        double f1= 12.99;
        double f2= 15.85;
        double f3= 25.85;
        System.out.println("Toplam Fiyat:" + (f1+f2+f3));

        float x =15.99F;
        long y =36L;
        int z=45;
        System.out.println("toplam Fiyat:" +(x*y*z));

        int anapara= 500000;
        int oran=6;
        int yılDeğeri=2;
        System.out.println(anapara*oran*yılDeğeri/100);

        String s ="Sonuç";
        long a=123L;
        long b= 9123456782L;
        System.out.println(s+(a+b));
        System.out.println(s+a*b);


        boolean a1=true;
        boolean a2=false;
        System.out.println(a1+" "+a2);

        float kitap = 12.99F;
        float defter=15.99F;
        float laptop=250.15F;
        float toplamFiyat=2*kitap+4*defter+3*laptop;
        System.out.println("Toplam Fiyat:"+ toplamFiyat);






    }
}
