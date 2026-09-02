package Poo.Desafio.Heranca.Teste;

import Poo.Desafio.Heranca.DesafioCarro.Carro;
import Poo.Desafio.Heranca.DesafioCarro.Civic;
import Poo.Desafio.Heranca.DesafioCarro.Ferrari;

public class CarroTeste {

    static void main(String[] args) {

        Carro c1 = new Civic();

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        Carro c2 = new Ferrari(400);

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);
    }
}
