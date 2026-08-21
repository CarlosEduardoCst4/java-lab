package Atividades;

public class GarrafaTeste {

    static void main(String[] args) {

        Garrafa g1 = new Garrafa();
        g1.tamanho = 300;
        g1.cor = "preto";
        g1.marca = "Dark Lab";
        g1.status();
        g1.abrirGarrafa();
        g1.tomarAgua();
    }
}
