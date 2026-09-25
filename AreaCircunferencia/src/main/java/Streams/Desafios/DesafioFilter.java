package Streams.Desafios;

import Atividades.Exercicio2.Aluno;
import Streams.Alunos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    static void main(String[] args) {

            Alunos a1 = new Alunos("Ygor", 6.8, 20);
            Alunos a2 = new Alunos("Carlos", 9.7, 2);
            Alunos a3 = new Alunos("Maria", 8.9, 5);
            Alunos a4 = new Alunos("Rafael", 5.5, 20);

        List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Alunos> notaAluno = n -> n.nota >= 7;
        Predicate<Alunos> faltasAluno = f -> f.faltas <=19;
        Function<Alunos, String> resposta =
                r -> "Aprovado - " + r.nome + ", Com "+ r.nota +" de Nota, e " + r.faltas + " Faltas!";

        alunos.stream()
                .filter(notaAluno)
                .filter(faltasAluno)
                .map(resposta)
                .forEach(System.out::println);
    }
}
