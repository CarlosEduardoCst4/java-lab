package Atividades.Escola;

public class Tecnico extends Aluno{
    private int registroProfissional;

    public void praticar(){
        System.out.println("Praticando o Curso!");
    }

    public void setRegistroProfissional(int registroProfissional){
        this.registroProfissional = registroProfissional;
    }
    public int getRegistroProfissional(){
        return registroProfissional;
    }
}
