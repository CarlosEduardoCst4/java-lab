package Atividades;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;


    public Lutador (String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void setVitorias(int v){this.vitorias = v;}
    public void setDerrotas(int d){this.derrotas = d;}
    public void setEmpates(int e){this.empates = e;}

    public String getNome(){return this.nome;}
    public String getNacionalidade(){return this.nacionalidade;}
    public int getIdade(){return this.idade;}
    public float getAltura(){return this.altura;}
    public float getPeso(){return this.peso;}
    public String getCategoria(){return this.categoria;}
    public int getVitorias(){return this.vitorias;}
    public int getDerrotas(){return this.derrotas;}
    public int getEmpates(){return this.empates;}


    public void apresentar(){
        System.out.println("--------------------------------------------");
        System.out.println("CHEGOU A HORA! - Apresentamos o Lutador " + this.nome);
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura ");
        System.out.println("Pesando " + this.getPeso() + "Kg - Na categoria " + this.getCategoria());
        System.out.print(this.getVitorias() + " Vitorias - ");
        System.out.print(this.getEmpates() + " Empates - ");
        System.out.print(this.getDerrotas() + " Derrotas");
    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " Vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " Vezes");
        System.out.println("Empatou " + this.getEmpates() + " Vezes");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }


    public void setNome(String no){this.nome = no;}
    public void setNacionalidade(String na){this.nacionalidade = na;}
    public void setIdade(int id){this.idade = id;}
    public void setAltura(float al){this.altura = al;}
    public void setPeso(float pe){
        this.peso = pe;
        setCategoria();
    }

    private void setCategoria(){
        if (this.peso<52.2){
            this.categoria = "Peso Inválido";
        } else if (this.peso<=70.3){
            this.categoria = "Peso Leve";
        } else if (this.peso<=83.9){
            this.categoria = "Peso Médio";
        } else if (this.peso<=120.2){
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Peso Invalido";
        }
    }
}