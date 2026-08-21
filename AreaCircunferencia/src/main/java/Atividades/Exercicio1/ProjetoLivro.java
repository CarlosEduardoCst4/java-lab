package Atividades.Exercicio1;

public class ProjetoLivro {
    static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Carlos", 20, "M");
        p[1] = new Pessoa("Maria", 19, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

        System.out.println(l[0].detalhes());
        l[1].abrir();
        l[1].folhear(150);
        System.out.println(l[1].detalhes());
    }
}
