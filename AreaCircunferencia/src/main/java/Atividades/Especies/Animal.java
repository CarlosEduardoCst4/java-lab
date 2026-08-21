package Atividades.Especies;

public class Animal {
    protected float peso;
    protected int idade;
    protected String membros;

    public void locomover(){}
    public void alimentar(){}
    public void emitirSom(){}

    public void setPeso(float peso){
        this.peso = peso;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setMembros(String membros){
        this.membros = membros;
    }

    public float getPeso(){
        return peso;
    }
    public int getIdade(){
        return idade;
    }
    public String getMembros(){
        return membros;
    }

}
