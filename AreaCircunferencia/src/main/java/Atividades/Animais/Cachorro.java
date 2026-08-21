package Atividades.Animais;

public class Cachorro extends Mamifero{

    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }

    public void reagir(int a, int b){
        if (a <= 12 || b >=7){
            System.out.println("Abanar");
        } else if (a >= 18 || b <= 22) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Latir");
        }
    }

    public void reagir(String frase){
        if (frase.equals("Comida") || frase.equals("ola")){
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int idade, float peso){
        if (idade > 7){
            if (peso < 15){
                System.out.println("Meia Idade");
            }
        } else {
            System.out.println("Cachorro de Boa idade");
        }
    }
}
