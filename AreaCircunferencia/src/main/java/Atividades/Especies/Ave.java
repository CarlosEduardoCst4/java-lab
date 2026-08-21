package Atividades.Especies;

public class Ave extends Animal{
    private String corPena;

    public void fazerNinho(boolean sim){
        if (sim){
            System.out.println("Construindo Ninho");
        } else {
            System.out.println("Ninho pronto");
        }
    }

    public void setCorPena(String corPena){
        this.corPena = corPena;
    }

    public String getCorPena(){
        return corPena;
    }
}
