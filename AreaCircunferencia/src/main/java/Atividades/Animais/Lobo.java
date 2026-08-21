package Atividades.Animais;

import java.util.Objects;

public class Lobo extends Mamifero{

    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuuuu!");
    }

    public void readir(String lb){
        if (lb.equals("Lobo a frente")){
            System.out.println("Ir embora!");
        } else {
            System.out.println("Cuidado!");
        }
    }
}
