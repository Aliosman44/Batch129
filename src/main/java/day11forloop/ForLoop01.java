package day11forloop;

public class ForLoop01 {

    public static void main(String[] args) {
        String t = "Germany";

        int i = 0;
        char ch = t.charAt(i);

        for (i = t.length() - 1; i >= 0; i--) {
            if (ch == 'a') {
                break;
            }
            System.out.print(t.charAt(i));
        }}}