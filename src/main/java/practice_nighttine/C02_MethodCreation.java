package practice_nighttine;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //Dikdörgenin alanını hesaplayan kodu yazınız ve kullannız.
        System.out.println("Dikdörtgenin Alanı :"+dikdörtgeninAlanı(10,5));
        System.out.println("Dikdörtgenin Çevresi :"+dikdörgeninÇevresi(5,10));
        kareninAlanı(25);


    }
    public static int dikdörtgeninAlanı(int a, int b){
        return a*b;

    }
    public static int dikdörgeninÇevresi (int a, int b){
        return 2*(a+b);
    }
    public static void kareninAlanı (int a){
        System.out.println("Karenin Alanı :"+(a*a));
    }
}
