package Generics;

public class CaixaTeste {

    static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.aguardar("Segredo!");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.aguardar(3.1415);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
