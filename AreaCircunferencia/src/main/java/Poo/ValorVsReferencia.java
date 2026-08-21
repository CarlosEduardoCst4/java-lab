package Poo;

public class ValorVsReferencia {
    static void main(String[] args) {

        double a = 2;
        double b = a; // atribuiçã por valor (Tipo Primitivo)

        a++;
        a--;

        System.out.println(a+ " " + b);

        Data d1 = new Data(1, 6, 2020);
        Data d2 = d1; // atribuição por referencia (objeto)

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltaDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void voltaDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}
