package Atividades.Especies;

public class MenuAnimal {
    static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setCorPelo("Caramelo");
        System.out.println(m.getCorPelo());

        r.setCorEscama("verde");
        System.out.println(r.getCorEscama());

        p.soltarBolha(false);

        a.fazerNinho(true);
    }
}
