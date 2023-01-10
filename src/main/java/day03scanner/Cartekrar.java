package day03scanner;

public class Cartekrar {
    public String marka= "Corolla";
    public int fiyat= 200000;
    public static void main(String[] args) {
        Car myCoralla = new Car();
        System.out.println(myCoralla.fiyat);
        System.out.println(myCoralla.model);
        myCoralla.hareket();
        myCoralla.dur();


    }
    public void  hareket (){
        System.out.println("Toyota Hızlı Hareket Eder");
    }
    public void dur(){
        System.out.println("Toyota Güvenle Durur.");
    }
    }

