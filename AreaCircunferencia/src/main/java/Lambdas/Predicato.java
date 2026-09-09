package Lambdas;

import java.util.function.Predicate;

public class Predicato {

    static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 3893.99, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
