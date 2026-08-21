package Atividades.Exercicio2;

public class ProjetoPessoa {
    static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Carlos");
        p3.setNome("Maria");
        p4.setNome("ygor");

        p2.setSexo("M");
        p4.setSexo("M");

        p3.receberAumento(100.08f);
        p4.mudaTrabalho();

        p2.setCurso("ADS");
        p3.setIdade(19);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
