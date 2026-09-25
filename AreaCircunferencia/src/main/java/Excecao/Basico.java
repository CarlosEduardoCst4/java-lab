package Excecao;

import Streams.Alunos;

public class Basico {

    static void main(String[] args) {

        Alunos a1 = null;

        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário");
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e){
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("Fim :)");
    }
    public static void imprimirNomeDoAluno(Alunos alunos){
        System.out.println(alunos.nome);
    }
}
