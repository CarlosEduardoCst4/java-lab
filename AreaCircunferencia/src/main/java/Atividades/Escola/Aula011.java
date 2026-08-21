package Atividades.Escola;

public class Aula011 {
    static void main(String[] args) {

        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsisita b1 = new Bolsisita();
        Tecnico t1 = new Tecnico();
        Professor p1 = new Professor();

        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");

        System.out.print(v1.toString());

        a1.setNome("Carlos");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.setCurso("ADS");
        a1.setMatricula(25042026);

        System.out.println(a1.toString());
        a1.pagarMensalidade();

        b1.setNome("Maria");
        b1.pagarMensalidade();

        t1.praticar();

        p1.setEspecialidade("Matematica");
        p1.setSalario(3500.00f);
        p1.setNome("Paulo");
        System.out.println("Salario " + p1.getSalario());
        p1.receberAumento(500.00f);
    }
}
