package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

    static void main(String[] args) {

        BinaryOperator<Double> soma = (x, y) -> {return x+y;};
        System.out.println(soma.apply(2.0,3.0));

        soma = (x, y) -> x * y;
        System.out.println(soma.apply(2.0,3.0));

        BinaryOperator<Integer> soma2 = (x, y) -> {return x+y;};
        System.out.println(soma2.apply(2,3));

        soma = (x, y) -> x * y;
        System.out.println(soma2.apply(2,3));
    }
}
