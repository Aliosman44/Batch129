package day02datatypesmethodcreation;


public class MyHomework {
    public static void main(String[] args) {
        int sonuç1 = dikdörtgeninAlanı(5,10);
        System.out.println(sonuç1 );
        int sonuç2 = dikdörtgenÇevresi (5,4);
        System.out.println(sonuç2);
        double sonuç3 = daireninAlanı (3.14,3);
        System.out.println(sonuç3 );
        double sonuç4 = daireninÇevresi (2,3.14,6);
        System.out.println(sonuç4);
        int a = 20;
        int b = 15;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);

    }

    private static int dikdörtgeninAlanı (int a, int b){
        return a*b;

    }
    protected static int dikdörtgenÇevresi (int a,int b){
        return 2*(a+b);
    }
    public static double daireninAlanı(double pi, int r){
        return pi*r*r;
    }
    public static double daireninÇevresi(int a,double pi,int r){
        return a*pi*r;
    }
}
