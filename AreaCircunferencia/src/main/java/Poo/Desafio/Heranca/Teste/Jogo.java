package Poo.Desafio.Heranca.Teste;

import Poo.Desafio.Heranca.Enum.Direcao;
import Poo.Desafio.Heranca.Enum.Heroi;
import Poo.Desafio.Heranca.Enum.Jogador;
import Poo.Desafio.Heranca.Enum.Monstro;

public class Jogo {
    static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + monstro.vida);
    }
}
