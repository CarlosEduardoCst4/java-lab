package Generics;

public class Caixa<TIPO> { //mas posso colocar só uma letra (ex: <T>, <X>)

    private TIPO coisa;

    public void guardar(TIPO coisa) {
        this.coisa = coisa;
    }

    public TIPO abrir() {
        return coisa;
    }
}
