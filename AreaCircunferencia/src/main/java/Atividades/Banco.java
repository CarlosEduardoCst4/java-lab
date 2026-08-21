package Atividades;

public class Banco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //set
    public void setNumCont(int numCont){this.numConta = numCont;}
    public void setTipo(String t){this.tipo = t;}
    public void setDono(String d){this.dono = d;}
    public void setSaldo(float s){this.saldo = s;}
    public void setStatus(boolean stt){this.status = stt;}

    //get
    public int getNumCont(){return this.numConta;}
    public String getTipo(){return this.tipo;}
    public String getDono(){return this.dono;}
    public float getSaldo(){return this.saldo;}
    public boolean getStatus(){return this.status;}

    //Metodos
    public Banco(){
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, ainda tem dinheiro nela!");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, pois está em debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono() + " no valor de " + v);
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }

    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + getDono() + " no valor de " + v);
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }

    public void pagamentoMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        } else if(this.getTipo() == "CP"){
            v =20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + getDono() + " no valor de " + v);
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }
    public void estadoAtual(){
        String c;
        System.out.println("------------------------------------");
        System.out.println("Numero da conta: " + getNumCont());
        System.out.println("Dono da conta: " + getDono());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Valor em conta: " + getSaldo());
        if(this.getStatus() == true){
             c = "Ativa";
        } else {
             c = "Fechada";
        }
        System.out.println("Status da conta: " + c);
    }
}
