package Atividades.Escola;

public class Bolsisita extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando Bolsa de " + this.getNome());
    }

    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
    public float getBolsa(){
        return bolsa;
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Mensalidade Paga!");
    }
}
