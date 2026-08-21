package Atividades;

public class Garrafa {
    public double tamanho;
    public String cor;
    public String marca;
    protected boolean tampa;

    public void abrirGarrafa(){
        this.tampa = true;
    }
    protected void tomarAgua(){
        if(this.tampa == true){
            System.out.println("Bebendo Agua!");
        } else {
            System.out.println("Tampa fechada!");
        }
    }
    public void status(){
        System.out.println("Tamanho da Garrafa: " + this.tamanho);
        System.out.println("Cor da Garrafa: " + this.cor);
        System.out.println("Marca da Garrafa: " + this.marca);
    }
}
