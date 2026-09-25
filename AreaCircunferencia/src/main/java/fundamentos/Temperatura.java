package Fundamentos;

public class Temperatura {
    static void main(String[] args) {
        double fahrenheit = 86;
        final double ajuste = 32;
        final double fator = 5.0/9.0;
        double celsius = (fahrenheit - ajuste) * fator;
        System.out.println(celsius);

        fahrenheit = 200;
        celsius = (fahrenheit - ajuste) * fator;
        System.out.println(celsius);

    }
}
