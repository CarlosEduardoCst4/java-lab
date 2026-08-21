package Poo;

public class DataTeste {

    static void main(String[] args) {
        Data d1 = new Data();

        var d2 = new Data();
        d2.dia = 7;
        d2.mes = 8;
        d2.ano = 2026;

        Data d3 = new  Data(3,5,2020);

        System.out.println("Ano - " + d1.obterDataFormatada());
        System.out.println("Ano - " + d2.obterDataFormatada());
        System.out.println("Ano - " + d3.obterDataFormatada());

    }
}
