package Poo.Desafio;

public class Pessoa {
    String nome;
    Double peso;

    Pessoa(String nome, Double peso){
            this.nome = nome;
            this.peso = peso;
    }

    void comer(Comida comida){
        if(comida != null)
            this.peso += comida.peso;
    }

    String apresentar(){
        return "Ola sou o " + nome + " e tenho " + peso + " kgs.";
    }
}
