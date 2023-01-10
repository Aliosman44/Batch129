package day05typecastinstringmanipulations;




public class eample1 {
    public static void main(String[] args) {
        String s= "Java is easy";
        System.out.println(s);
        char s1 = s.charAt(1);
        System.out.print(s1);
        char s2 = s.charAt(10);
        System.out.println(s2);
        System.out.println(""+s1 +s2);
        int s4=s.length();
        System.out.println(s4);
        String s5 = s.substring(5,7);
        System.out.println(s5);
        String s6 =s.substring(8,12);
        System.out.println(s6);
        boolean s7= s.contains("easy");
        System.out.println(s7);
        boolean s8= s.startsWith("Java");
        System.out.println(s8);
        String z = "Learn Java earn money";
        boolean z1=z.endsWith("m");
        System.out.println(z1);
        String z2= z.replace("money","dollar");
        System.out.println(z2);
        String z3= z.replace("a","*");
        System.out.println(z3);
        String t= "Ali 13 Yaşındadır.";
        String t1= t.replaceAll("[a-zA-Z0-9]","*");
        System.out.println(t1);
        String b = "Beren 43 yaşında.";
        String b1 = b.replaceAll("[a-z]","*");
        System.out.println(b1);
        String b2= b.replaceAll("[A-Z]","&");
        System.out.println(b2);
        String b3=b.replaceAll("[a-zA-Z0-9]","");
        System.out.println(b3);
        String b4 = b.replaceAll("\\p{Punct}","&");
        System.out.println(b4);




    }
}
