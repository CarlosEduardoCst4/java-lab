package Atividades.Animais;

public class Mamifero extends Animal{
    protected String corPelo;

    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }
}
