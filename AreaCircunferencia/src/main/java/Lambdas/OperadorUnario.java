package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadeado = n -> n * n;

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadeado)
                .apply(0);
        System.out.println(resultado1);

        int resultado2 = aoQuadeado
                .andThen(vezesDois)
                .andThen(maisDois)
                .apply(0);

        System.out.println(resultado2);
    }
}
