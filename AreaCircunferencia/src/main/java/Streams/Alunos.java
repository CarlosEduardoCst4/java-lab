package Streams;

public class Alunos {

    final public String nome;
    final public double nota;
    final public double faltas;

    public Alunos(String nome, double nota){
        this("Carlos Eduardo", 10, 15);
    }

    public Alunos(String nome, double nota, double faltas){
        this.nome = nome;
        this.nota = nota;
        this.faltas = faltas;
    }

    public String toString(){
        return nome + " tem nota " + nota;
    }

}
