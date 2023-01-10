package day04asciiwrapperclassoperatorsmemoryusage;

import com.sun.jdi.connect.Connector;

public class WrapperClass {
    public static void main(String[] args) {
        int n = 12;

        Integer m = 12;

        byte p = 23;
        Byte r = 43;

        short max = Short.MAX_VALUE;
        System.out.println(max);
        short min = Short.MIN_VALUE;
        System.out.println(min);

        int intmin = Integer.MIN_VALUE;
        byte bytemax= Byte.MAX_VALUE;
        System.out.println(intmin+bytemax);

        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);







    }
}
