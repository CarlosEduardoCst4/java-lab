package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    static void main(String[] args) {
        double b = 1; // implicita
        System.out.println(b);

        float a = (float) 1.2345678; // explicita (CAST)
        System.out.println(a);

        int c =340;
        byte d = (byte) c; //explicita (CAST)
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e; // explicita (CAST)
        System.out.println(f);
    }
}
