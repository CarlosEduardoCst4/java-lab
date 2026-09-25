package Streams;

import Atividades.Exercicio2.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    static void main(String[] args) {

        Alunos a1 = new Alunos("Ana", 7.8);
        Alunos a2 = new Alunos("Bia", 5.8);
        Alunos a3 = new Alunos("Danial", 9.8);
        Alunos a4 = new Alunos("Gui", 6.8);
        Alunos a5 = new Alunos("Rebeca", 7.1);
        Alunos a6 = new Alunos("Pedro", 8.8);

        List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Alunos> aprovado = a -> a.nota>= 7;

        Function<Alunos, String> saudacaoAprovado =
                a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";

        alunos.stream().filter(aprovado).map(saudacaoAprovado).forEach(System.out::println);

    }
}
