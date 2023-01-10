package practice_nighttine;

public class C02_ForLoop {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
// sekilde yazdiriniz, bosluk " " veya 'a' harfi geldiginde bunlari yazmasin

        String kelime= "Gazi Antep";

        for (int i = 0; i <kelime.length() ; i++) {

            if(kelime.charAt(i)=='a' || kelime.charAt(i)==' '){
    continue;

            }
            System.out.println(kelime.charAt(i));
        }
    }
}
