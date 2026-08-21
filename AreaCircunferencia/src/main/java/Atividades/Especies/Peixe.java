package Atividades.Especies;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha(boolean sim){
        if (sim){
            System.out.println("Soltando Bolha");
        } else {
            System.out.println("Fundo do lago");
        }
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    public String getCorEscama(){
        return corEscama;
    }
}
