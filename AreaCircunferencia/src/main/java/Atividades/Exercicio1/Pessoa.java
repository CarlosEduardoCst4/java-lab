package Atividades.Exercicio1;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Metodos
    public void fazerAniver(){
        this.idade++;
    }


    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //Get e Set
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
}
