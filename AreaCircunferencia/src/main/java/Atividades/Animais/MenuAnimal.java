package Atividades.Animais;

public class MenuAnimal {
    static void main(String[] args) {
        Cachorro c = new Cachorro();
        Lobo b = new Lobo();

        c.reagir(8, 12);
        c.reagir("ola");
        c.reagir(5,10.4f);

        b.emitirSom();
        b.readir("Lobo a frente");
        b.readir("Area de lobo");
    }
}
