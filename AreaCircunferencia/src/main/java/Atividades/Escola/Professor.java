package Atividades.Escola;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float s){
        float v = this.salario += s;
        System.out.println(this.getNome() + " o salario agora é: " + v);
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return salario;
    }
}
