package day05typecastinstringmanipulations;

import java.util.Locale;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s="Java is easy";
        String süpper= s.toUpperCase();
        System.out.println(süpper);

        String slower= s.toLowerCase();
        System.out.println(slower);

        char firstchar = s.charAt(0);
        System.out.println(firstchar);
        char seceondChar= s.charAt(2);
        char sscondlastchar= s.charAt(10);
        System.out.print(seceondChar);
        System.out.println(sscondlastchar);
        int sLeeght= s.length();
        System.out.println(sLeeght);
        String sub1 = s.substring(0,4);
        System.out.println(sub1);
        String sub2 = s.substring(5,7);
        System.out.println(sub2);
        String sub3 = s.substring(8,12);
        System.out.println(sub3);
        String sub4 = s.substring(8);
        System.out.println(sub4);
        boolean sub5 = s.contains("money");
        System.out.println(sub5);
        boolean sub6 = s.startsWith("Java");
        System.out.println(sub6);
        boolean sub7= s.startsWith("i",5);
        System.out.println(sub7);

    }
}
