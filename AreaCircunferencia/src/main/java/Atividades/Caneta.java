package Atividades;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, boolean t){
        this.modelo = m;
        this.cor = c;
        this.tampada = t;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor(){ return  this.cor;}

    public void setCor(String c){ this.cor = c;}

}
