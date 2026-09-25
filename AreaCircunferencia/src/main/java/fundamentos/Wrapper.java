package Fundamentos;

public class Wrapper {

    static void main(String[] args) {

        Byte b = 100;
        Short s = 1000;

        Integer i = 10000;
        long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());

        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 1234.60F;
        System.out.println(f);

        double d = 2345.8769;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; //char
        System.out.println(c + "...");
    }
}