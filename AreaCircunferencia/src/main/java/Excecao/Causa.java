package Excecao;

import Streams.Alunos;

public class Causa {

    static void main(String[] args) {
        try {
            metodoA(null);
        } catch (IllegalArgumentException e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
    }

    static void metodoA(Alunos alunos) {
        try {
            metodoB(alunos);
        } catch (Exception causa){
            throw new IllegalArgumentException(causa);
        }
    }
    static void metodoB(Alunos alunos) {
        if (alunos == null) {
            throw new NullPointerException("Aluno ésta no NULLLLOOOOOO!");
        }

        System.out.println(alunos.nome);
    }
}
