package Poo;


public class AreaCirc {

    double raio;
    final static double pi = 3.1415;
    final static double PI = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double Area(){
        return pi * Math.pow(raio, 2);
    }

    static double Area(double raio){
        return pi * Math.pow(raio, 2);
    }
}
