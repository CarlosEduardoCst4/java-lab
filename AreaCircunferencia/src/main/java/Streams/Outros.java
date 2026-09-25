package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

    static void main(String[] args) {

        Alunos a1 = new Alunos("Ana", 7.1);
        Alunos a2 = new Alunos("Luna", 6.1);
        Alunos a3 = new Alunos("Gui", 8.1);
        Alunos a4 = new Alunos("Gabi", 10);
        Alunos a5 = new Alunos("Ana", 7.1);
        Alunos a6 = new Alunos("Luna", 6.1);
        Alunos a7 = new Alunos("Gui", 8.1);
        Alunos a8 = new Alunos("Gabi", 10);

        List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);
    }
}
