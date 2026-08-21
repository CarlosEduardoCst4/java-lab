package Atividades;

public class CanetaTeste {
    static void main(String[] args) {
        Caneta c1 = new Caneta("Mac", "Vermelho", false);

        c1.setPonta(0.5f);

        System.out.println("Tenho uma Caneta " + c1.getModelo()
                + " e ela tem a ponta " + c1.getPonta() + " e a cor dela é " + c1.getCor());
    }
}
